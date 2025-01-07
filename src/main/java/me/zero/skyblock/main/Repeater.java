package me.zero.skyblock.main;

import me.zero.skyblock.user.User;
import me.zero.skyblock.util.*;
import net.minecraft.server.v1_8_R3.EntityHuman;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftHumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Repeater
{

    private final List<BukkitTask> tasks;
    private final List<AtomicInteger> counters;

    public Repeater()
    {
        this.tasks = new ArrayList<>();
        this.counters = new ArrayList<>(5);
        counters.add(new AtomicInteger());
        int[] counters = {0, 0};
        this.tasks.add(new BukkitRunnable()
        {
            public void run()
            {
                SkyBlockCalendar.ELAPSED += 10L;
                for (Player player : Bukkit.getOnlinePlayers())
                {
                    PlayerInventory inventory = player.getInventory();
                    User user = User.getUser(player.getUniqueId());

                    // Some Default Stuff
                    player.setSaturation(1000.0f);
                    player.setFoodLevel(20);
                    UUID uuid = player.getUniqueId();

                    // Add to Statistics Cache if not found
                    

                    // Sidebar
                    Sidebar sidebar = new Sidebar("" + "§e§lSKYBLOCK", "SKYBLOCK");
                    sidebar.add(ChatColor.GRAY + SUtil.getDate() + " sbh-1");
                    sidebar.add("  ");
                    sidebar.add(" " + SkyBlockCalendar.getMonthName() + " " + SUtil.ntify(SkyBlockCalendar.getDay()));
                    boolean day = true;
                    int time = (int) ((SkyBlockCalendar.ELAPSED % 24000) - 6000);
                    if (time < 0)
                        time += 24000;
                    int hours = 6 + (time / 1000);
                    int minutes = (int) ((time % ((hours - 6) * 1000.0)) / 16.66666);
                    String sMin = String.valueOf(minutes);
                    minutes = minutes - Integer.parseInt(sMin.substring(sMin.length() - 1));
                    if (hours >= 24) hours -= 24;
                    if (hours <= 6 || hours >= 20) day = false;
                    sidebar.add(ChatColor.GRAY + " " + (hours > 12 ? hours - 12 : (hours == 0 ? 12 : hours)) + ":" + SUtil.zeroed(minutes) +
                            (hours >= 12 ? "pm" : "am") + " " + (day ? ChatColor.YELLOW + "☀" : ChatColor.AQUA + "☽"));
                    String location = "None";
                    sidebar.add(ChatColor.GRAY + " ⏣ " + location);
                    sidebar.add(" ");
                    sidebar.add("Purse: §6" + SUtil.commaify(user.getCoins()));
                    sidebar.add("Bits: §cComing Soon");
                    sidebar.add("     ");
                    sidebar.add(ChatColor.YELLOW + "www.hyblixel.net");
                    sidebar.apply(player);
                    }
                    
                }
        }.runTaskTimer(SkyblockGame.getPlugin(SkyblockGame.class), 0, 10));
    }

    public void stop()
    {
        for (BukkitTask task : this.tasks)
            task.cancel();
    }

}