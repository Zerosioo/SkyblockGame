package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MaintenanceCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("SkyblockGame.ADMIN")) {
            sender.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
            return true;
        }

        if (args.length != 1) {
            sender.sendMessage(ChatColor.RED + "Usage: /maintenance <true|false>");
            return true;
        }

        String state = args[0].toLowerCase();

        switch (state) {
            case "true":
                Bukkit.setWhitelist(true);
                Bukkit.broadcastMessage(ChatColor.GOLD + "The server is now in maintenance mode. Whitelist is enabled.");
                break;
            case "false":
                Bukkit.setWhitelist(false);
                Bukkit.broadcastMessage(ChatColor.GOLD + "Maintenance mode is now off. Whitelist is disabled.");
                break;
            default:
                sender.sendMessage(ChatColor.RED + "Invalid argument. Use 'true' or 'false'.");
                break;
        }
        return true;
    }
}