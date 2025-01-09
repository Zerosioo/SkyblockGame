package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
description = "Toggle maintenance mode", 
usages = "§cUsage: /maintenance <true|false>",
rank = PlayerRank.ADMIN)
public class MaintenanceCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        if (args.length != 1) {
            player.sendMessage(ChatColor.RED + "Usage: /maintenance <true|false>");
            return;
        }

        String state = args[0].toLowerCase();

        switch (state) {
            case "true":
            case "on":
                Bukkit.setWhitelist(true);
                Bukkit.broadcastMessage(ChatColor.GOLD + "The server is now in maintenance mode. Whitelist is enabled.");
                break;
            case "false":
            case "off":
                Bukkit.setWhitelist(false);
                Bukkit.broadcastMessage(ChatColor.GOLD + "Maintenance mode is now off. Whitelist is disabled.");
                break;
            default:
                player.sendMessage(ChatColor.RED + "Invalid argument. Use 'true' or 'false'.");
                break;
        }
    }
}
