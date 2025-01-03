package me.zero.skyblock.util;

import org.bukkit.scheduler.BukkitRunnable;
import me.zero.skyblock.main.SkyblockGame;
import org.bukkit.entity.Player;
import java.util.List;

public class SUtil {
	private static SkyblockGame plugin = SkyblockGame.getPlugin(SkyblockGame.class);

        public static void runAsync(Runnable runnable)     {
        new Thread(runnable).start();
    }
    
    public static void delaySync(Runnable task, long delay) {
        new BukkitRunnable() {
            @Override
            public void run() {
                task.run();
            }
        }.runTaskLater(plugin, delay);
    }
    
     public static void delay(final Runnable runnable, final long delay) {
        new BukkitRunnable() {
            public void run() {
                runnable.run();
            }
        }.runTaskLater(SkyblockGame.getPlugin(SkyblockGame.class), delay);

     }
     
      public static double square(double val) {
        return val * val;
    }
    

}