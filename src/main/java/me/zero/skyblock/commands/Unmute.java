package me.zero.skyblock.commands;

import me.zero.skyblock.main.SkyblockGame;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class Unmute implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender.hasPermission("SkyblockGame.JRHELPER")) {
			if (args.length >= 1) {
				Player target = Bukkit.getPlayerExact(args[0]);
				File playerfile = new File(((SkyblockGame)SkyblockGame.getPlugin(SkyblockGame.class)).getDataFolder() + File.separator, "punishments.yml");
				FileConfiguration playerData = YamlConfiguration.loadConfiguration(playerfile);
				String uuid = null;
				if (target != null) {
					uuid = target.getPlayer().getUniqueId().toString();
				}

				if (uuid == null) {
					Iterator var10 = playerData.getKeys(false).iterator();

					while(var10.hasNext()) {
						String key = (String)var10.next();
						if (playerData.getString(key + ".name").equalsIgnoreCase(args[0])) {
							uuid = key;
						}
					}
				}

				if (uuid == null) {
					sender.sendMessage("Â§cPlayer does not exist.");
					return false;
				}

				if (playerData.contains(uuid)) {
					if (playerData.getBoolean(uuid + ".mute.ismuted")) {
						try {
							playerData.set(uuid + ".mute.ismuted", false);
							playerData.set(uuid + ".mute.reason", "");
							playerData.set(uuid + ".mute.length", 0);
							playerData.set(uuid + ".mute.id", "");
							playerData.save(playerfile);
							if (target != null) {
								sender.sendMessage("Â§aUnmuted " + Bukkit.getPlayer(args[0]).getName());
							} else {
								sender.sendMessage("Â§aUnmuted " + args[0]);
							}
						} catch (IOException var11) {
							var11.printStackTrace();
						}
					} else {
						sender.sendMessage("Â§cPlayer is not muted!");
					}
				}
			} else {
				sender.sendMessage("Â§cInvalid syntax. Correct: /unmute <name>");
			}
		} else {
			sender.sendMessage("Â§cYou do not have permission to execute this command!");
		}

		return false;
	}
}
