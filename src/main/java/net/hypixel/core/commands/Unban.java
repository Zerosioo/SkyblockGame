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

public class Unban implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender.hasPermission("SkyblockGame.MOD")) {
			if (args.length >= 1) {
				Player target = Bukkit.getPlayerExact(args[0]);
				File playerfile = new File((SkyblockGame.getPlugin(SkyblockGame.class)).getDataFolder() + File.separator, "punishments.yml");
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
					sender.sendMessage("§cPlayer does not exist.");
					return false;
				}

				if (playerData.contains(uuid)) {
					if (playerData.getBoolean(uuid + ".ban.isbanned")) {
						try {
							playerData.set(uuid + ".ban.isbanned", false);
							playerData.set(uuid + ".ban.reason", "");
							playerData.set(uuid + ".ban.length", 0);
							playerData.set(uuid + ".ban.id", "");
							playerData.save(playerfile);
							if (target != null) {
								sender.sendMessage("§aUnbanned " + Bukkit.getPlayer(args[0]).getName());
							} else {
								sender.sendMessage("§aUnbanned " + args[0]);
							}
						} catch (IOException var11) {
							var11.printStackTrace();
						}
					} else {
						sender.sendMessage("§cPlayer is not banned!");
					}
				}
			} else {
				sender.sendMessage("§cInvalid syntax. Correct: /unban <name>");
			}
		} else {
			sender.sendMessage("§cYou do not have permission to execute this command!");
		}

		return false;
	}
}
