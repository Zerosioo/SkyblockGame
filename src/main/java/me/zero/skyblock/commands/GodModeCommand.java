package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
description = "Toggle Godmode", 
usages = "§cUsage: /godmode",
rank = PlayerRank.ADMIN)
public class GodModeCommand extends SkyBlockCommand {
	
	private static final Set<String> godModePlayers = new HashSet<>();

    @Override
    public void execute(Player player, String[] args)     {
        if (godModePlayers.contains(player.getName())) {
            godModePlayers.remove(player.getName());
            player.sendMessage(ChatColor.RED + "God mode disabled.");
        } else {
            godModePlayers.add(player.getName());
            player.sendMessage(ChatColor.GREEN + "God mode enabled.");
        }
    }
    
    public static boolean isGodModeEnabled(String playerName) {
        return godModePlayers.contains(playerName);
    }
}
