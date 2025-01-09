package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@CommandParameters(
description = "Toggle flight", 
usages = "§cUsage: /fly",
rank = PlayerRank.GAMEMASTER)
public class FlyCommand extends SkyBlockCommand {
	
	private final Set<Player> flyingPlayers = new HashSet<>();

    @Override
    public void execute(Player player, String[] args)     {
        toggleFlight(player);
    }
    private void toggleFlight(Player player) {
        if (flyingPlayers.contains(player)) {
            player.setAllowFlight(false);
            player.setFlying(false);
            flyingPlayers.remove(player);
            player.sendMessage(ChatColor.RED + "Flight mode has been disabled.");
        } else {
            player.setAllowFlight(true);
            player.setFlying(true);
            flyingPlayers.add(player);
            player.sendMessage(ChatColor.GREEN + "Flight mode has been enabled.");
        }
    }
}
