package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
description = "Announce a message", 
usages = "§cUsage: /alert <message>",
rank = PlayerRank.ADMIN)
public class AlertCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        if (args.length < 1) {
			player.sendMessage("§cUsage: /alert <message>");
		}
		
		String message = String.join(" ", args);
		Bukkit.broadcastMessage("§c[ANNOUNCEMENT] §r" + ChatColor.translateAlternateColorCodes('&', message));
    }
}
