package me.zero.skyblock.commands;

import me.zero.skyblock.main.SkyblockGame;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kick implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender.hasPermission("SkyblockGame.MOD")) {
			if (args.length >= 2) {
				String reason = "";

				for(int i = 1; i < args.length; ++i) {
					reason = reason + args[i] + " ";
				}

				Player target = Bukkit.getPlayerExact(args[0]);
				if (target == null) {
					sender.sendMessage("§cPlayer does not exist or offline.");
					return false;
				}

				sender.sendMessage("§aKicked player " + Bukkit.getPlayer(args[0]).getName() + " for " + reason);
				target.kickPlayer("§cYou have been kicked!\n\n§7Reason: §f" + reason + "\n" + "§7Find out more: §b§n" + ((SkyblockGame)SkyblockGame.getPlugin(SkyblockGame.class)).getConfig().getString("kickdomain"));
			} else {
				sender.sendMessage("§cInvalid syntax. Correct: /kick <name> <reason>");
			}
		} else {
			sender.sendMessage("§cYou do not have permission to execute this command!");
		}

		return false;
	}
}
