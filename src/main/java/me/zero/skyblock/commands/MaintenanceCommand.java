package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.main.SkyblockGame;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
description = "Maintenance mode toggle", 
usages = "§cUsage: /maintenance <on/off/urgent>",
rank = PlayerRank.ADMIN)
public class MaintenanceCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        if (args.length == 0) {
            player.sendMessage(ChatColor.RED + "Usage: /Maintenance <on/off/urgent>");
            return;
        }

        FileConfiguration config = SkyblockGame.getInstance().getConfig();

        if (args[0].equalsIgnoreCase("on")) {
            config.set("Maintenance", true);
            SkyblockGame.getInstance().saveConfig();
            player.sendMessage(ChatColor.GREEN + "Maintenance mode enabled. Kicking players in 15 seconds.");

            new BukkitRunnable() {
                int countdown = 15;

                @Override
                public void run() {
                    if (countdown > 0) {
                    countdown--;
                    } else {
                        for (Player player : Bukkit.getOnlinePlayers()) {
                            player.kickPlayer("§cWe are sorry but Hyblixel Network is currently down for maintenance.\n\n§cFor more information join our §9Discord§c.");
                        }
                        cancel();
                    }
                }
            }.runTaskTimer(SkyblockGame.getInstance(), 0, 20);

            return;

        } else if (args[0].equalsIgnoreCase("urgent")) {
            config.set("Maintenance", true);
            SkyblockGame.getInstance().saveConfig();
            player.sendMessage(ChatColor.RED + "Urgent Maintenance enabled. Kicking players immediately.");

            for (Player pall : Bukkit.getOnlinePlayers()) {
                pall.kickPlayer("§cWe are sorry but Hyblixel Network is currently down for maintenance.\n\n§cFor more information join our §bDiscord§c.\n§c");
            }

            return;

        } else if (args[0].equalsIgnoreCase("off")) {
            config.set("Maintenance", false);
            SkyblockGame.getInstance().saveConfig();
            player.sendMessage(ChatColor.GREEN + "Maintenance mode disabled.");
            return;
        }

        player.sendMessage(ChatColor.RED + "Invalid usage. Use: /Maintenance <on/off/urgent>");
        return;
    }
    
}
