package me.zero.skyblock.main;

import net.minecraft.server.v1_8_R3.Blocks;
import net.minecraft.server.v1_8_R3.IBlockData;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;

import me.zero.skyblock.util.XYZ;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class NewYearCelebrate {
    public static void celebrate() {
        System.out.println("NEW YEAR!");

        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(1).truncatedTo(ChronoUnit.HOURS);

        Duration duration = Duration.between(start, end);
        long millis = duration.toMillis();
        Bukkit.getScheduler().runTaskAsynchronously(SkyblockGame.getInstance(), () -> {

            Bukkit.getScheduler().runTaskTimer(SkyblockGame.getInstance(), () -> {
                spawnFirework(new XYZ(-6, 71, -65).toLocation(Bukkit.getWorld("world")));
                spawnFirework(new XYZ(0, 71, -65).toLocation(Bukkit.getWorld("world")));
                spawnFirework(new XYZ(0, 71, -61).toLocation(Bukkit.getWorld("world")));
                spawnFirework(new XYZ(-6, 71, -61).toLocation(Bukkit.getWorld("world")));

                spawnFirework(new XYZ(-1, 71, -66).toLocation(Bukkit.getWorld("world")));
                spawnFirework(new XYZ(-5, 71, -66).toLocation(Bukkit.getWorld("world")));
                spawnFirework(new XYZ(-5, 71, -60).toLocation(Bukkit.getWorld("world")));
                spawnFirework(new XYZ(-1, 71, -60).toLocation(Bukkit.getWorld("world")));

            }, 0, 60);

        });
    }

    private static void spawnFirework(Location location) {
        location.add(0.5, 0.5, 0.5);
        Firework fw = (Firework) location.getWorld().spawnEntity(location, EntityType.FIREWORK);
        FireworkMeta fwm = fw.getFireworkMeta();

        Random r = new Random();

        int rt = r.nextInt(4) + 1;
        FireworkEffect.Type type = FireworkEffect.Type.BALL;
        if (rt == 1)
            type = FireworkEffect.Type.BALL;
        if (rt == 2)
            type = FireworkEffect.Type.BALL_LARGE;
        if (rt == 3)
            type = FireworkEffect.Type.BURST;
        if (rt == 4)
            type = FireworkEffect.Type.CREEPER;
        if (rt == 5)
            type = FireworkEffect.Type.STAR;
        FireworkEffect effect = FireworkEffect.builder().flicker(r.nextBoolean())
                .withColor(Color.fromRGB((int) (Math.random() * 255), (int) (Math.random() * 255),
                        (int) (Math.random() * 255)))
                .withFade(Color.fromRGB((int) (Math.random() * 255), (int) (Math.random() * 255),
                        (int) (Math.random() * 255)))
                .with(type).trail(r.nextBoolean()).build();
        fwm.addEffect(effect);
        fwm.setPower(2);
        fw.setFireworkMeta(fwm);
    }
}
