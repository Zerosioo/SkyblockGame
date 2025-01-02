package me.zero.skyblock.commands;

import me.zero.skyblock.main.SkyblockGame;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import org.apache.commons.lang.RandomStringUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class Ban implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender.hasPermission("SkyblockGame.MOD")) {
			if (args.length >= 2) {
				String reason = "";

				for(int i = 1; i < args.length; ++i) {
					reason = reason + args[i] + " ";
				}

				reason = reason.substring(0, reason.length() - 1);
				Player target = Bukkit.getPlayerExact(args[0]);
				File playerfile = new File((SkyblockGame.getPlugin(SkyblockGame.class)).getDataFolder() + File.separator, "punishments.yml");
				FileConfiguration playerData = YamlConfiguration.loadConfiguration(playerfile);
				String uuid = null;
				if (target != null) {
					uuid = target.getPlayer().getUniqueId().toString();
				}

				String characters;
				if (uuid == null) {
					Iterator var11 = playerData.getKeys(false).iterator();

					while(var11.hasNext()) {
						characters = (String)var11.next();
						if (playerData.getString(characters + ".name").equalsIgnoreCase(args[0])) {
							uuid = characters;
						}
					}
				}

				if (uuid == null) {
					sender.sendMessage("§cPlayer does not exist.");
					return false;
				}

				if (playerData.contains(uuid)) {
					if (!playerData.getBoolean(uuid + ".ban.isbanned")) {
						try {
							characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
							String pwd = RandomStringUtils.random(8, characters);
							playerData.set(uuid + ".ban.isbanned", true);
							playerData.set(uuid + ".ban.reason", reason);
							playerData.set(uuid + ".ban.length", -1);
							playerData.set(uuid + ".ban.id", pwd);
							playerData.save(playerfile);
							if (target == null) {
								sender.sendMessage("§aPermanently banned " + args[0] + " for " + reason);
							}

							if (target != null) {
								sender.sendMessage("§aPermanently banned " + Bukkit.getPlayer(args[0]).getName() + " for " + reason);
								target.getPlayer().kickPlayer("§cYou are permanently banned from this server!\n\n§7Reason: §f" + playerData.getString(uuid + ".ban.reason") + "\n" + "§7Find out more: §b§n" + ((SkyblockGame)SkyblockGame.getPlugin(SkyblockGame.class)).getConfig().getString("bandomain") + "\n\n" + "§7Ban ID: §f#" + playerData.getString(uuid + ".ban.id") + "\n" + "§7Sharing your Ban ID may affect the processing of your appeal!");
							}
						} catch (IOException var12) {
							var12.printStackTrace();
						}
					} else {
						sender.sendMessage("§cPlayer is already banned!");
					}
				}
			} else {
				sender.sendMessage("§cInvalid syntax. Correct: /ban <name> <reason>");
			}
		} else {
			sender.sendMessage("§cYou do not have permission to execute this command!");
		}

		return false;
	}
}
