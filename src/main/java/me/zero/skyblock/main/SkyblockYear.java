package me.zero.skyblock.main;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import me.zero.skyblock.util.HologramUtil;

import java.io.*;
import java.time.Duration;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class SkyblockYear {

    private static final ZonedDateTime SKYBLOCK_START = ZonedDateTime.of(2019, 6, 11, 0, 0, 0, 0, ZoneOffset.UTC);
    private static final long MINUTES_PER_YEAR = 372 * 20; // 7440 minutes
    private static final File DATA_FILE = new File("plugins/SkyblockGame/year.yml");

    public static int getCurrentYear() {
        Duration duration = Duration.between(SKYBLOCK_START, ZonedDateTime.now(ZoneOffset.UTC));
        long totalMinutes = duration.toMinutes();
        return (int) (totalMinutes / MINUTES_PER_YEAR) + 1;
    }

    public static boolean isNewYear() {
        Duration duration = Duration.between(SKYBLOCK_START, ZonedDateTime.now(ZoneOffset.UTC));
        long totalMinutes = duration.toMinutes();
        return (totalMinutes % MINUTES_PER_YEAR) < 20;
    }

    public static int getLastYear() {
        if (!DATA_FILE.exists()) {
            saveYear(-1);
            return -1;
        }

        try (InputStream input = new FileInputStream(DATA_FILE)) {
            Yaml yaml = new Yaml(new Constructor(Map.class));
            Map<String, Object> data = (Map<String, Object>) yaml.load(input);
            if (data != null && data.containsKey("lastYearCelebrated")) {
                Object val = data.get("lastYearCelebrated");
                if (val instanceof Integer) return (int) val;
                if (val instanceof String) return Integer.parseInt((String) val);
            }
        } catch (Exception ignored) {}
        return -1;
    }

    public static void saveYear(int year) {
        try {
            DATA_FILE.getParentFile().mkdirs();
            Map<String, Object> data = new HashMap<>();
            data.put("lastYearCelebrated", year);
            try (Writer writer = new FileWriter(DATA_FILE)) {
                new Yaml().dump(data, writer);
            }
        } catch (IOException ignored) {}
    }

    /**
     * Starts the New Year check logic. Broadcasts and saves year when a new one is detected.
     * @param plugin Plugin instance
     * @param checkIntervalTicks Tick delay between checks (e.g. 20 = every 1 second)
     */
    public static void startYearCounting(JavaPlugin plugin, long checkIntervalTicks) {
        new BukkitRunnable() {
            @Override
            public void run() {
                int current = getCurrentYear();
                int last = getLastYear();

                if (isNewYear() && current > last) {
                    Bukkit.broadcastMessage("§6 Happy New SkyBlock Year " + current + "!");
                    NewYearCelebrate.celebrate();
                    saveYear(current);
                }
            }
        }.runTaskTimer(plugin, 0L, checkIntervalTicks);
    }

    /**
     * Spawns a hologram that dynamically updates with the current SkyBlock year.
     * @param plugin Plugin instance
     * @param location Where to spawn the hologram
     */
    public static void createYearHologram(JavaPlugin plugin, Location location) {
        HologramUtil.createChangingHologram(location, plugin,
                () -> "§eSkyBlock Year: §6" + getCurrentYear(), 20L);
    }
}
