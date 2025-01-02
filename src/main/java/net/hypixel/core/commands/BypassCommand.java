package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BypassCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("SkyblockGame.ADMIN")) {
            sender.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
            return true;
        }

        if (args.length != 2) {
            sender.sendMessage(ChatColor.RED + "Usage: /bypass <add|remove> <player>");
            return true;
        }

        String action = args[0].toLowerCase();
        String playerName = args[1];
        OfflinePlayer player = Bukkit.getOfflinePlayer(playerName);

        switch (action) {
            case "add":
                player.setWhitelisted(true);
                sender.sendMessage(ChatColor.GREEN + "Player " + playerName + " has been added to the whitelist.");
                break;
            case "remove":
                player.setWhitelisted(false);
                sender.sendMessage(ChatColor.GREEN + "Player " + playerName + " has been removed from the whitelist.");
                break;
            default:
                sender.sendMessage(ChatColor.RED + "Invalid argument. Use 'add' or 'remove'.");
                break;
        }
        return true;
    }
}