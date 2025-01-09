package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
description = "Whitelist a player", 
usages = "§cUsage: /bypass <add|remove> <player>",
rank = PlayerRank.GAMEMASTER)
public class BypassCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        if (args.length != 2) {
            player.sendMessage(ChatColor.RED + "Usage: /bypass <add|remove> <player>");
            
        }

        String action = args[0].toLowerCase();
        String playerName = args[1];
        OfflinePlayer offlineplayer = Bukkit.getOfflinePlayer(playerName);

        switch (action) {
            case "add":
                offlineplayer.setWhitelisted(true);
                player.sendMessage("§ePlayer " + playerName + " has been added to the whitelist.");
                break;
            case "remove":
                player.setWhitelisted(false);
                player.sendMessage(ChatColor.GREEN + "Player " + playerName + " has been removed from the whitelist.");
                break;
            default:
                player.sendMessage(ChatColor.RED + "Invalid argument. Use 'add' or 'remove'.");
                break;
        }
        
    }
}
