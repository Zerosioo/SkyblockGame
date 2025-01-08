package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(description = "Modify player coins", rank = PlayerRank.ADMIN)
public class AlertCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
        if (args.length < 1) {
			player.sendMessage("§eUsage: §b/announce <message>");
		}
		
		String message = String.join(" ", args);
		Bukkit.broadcastMessage("§c[ANNOUNCEMENT] §r" + message);
    }
}
