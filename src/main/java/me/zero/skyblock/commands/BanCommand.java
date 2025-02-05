package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import org.apache.commons.lang.RandomStringUtils;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import me.zero.skyblock.Configuration;
import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.main.SkyblockGame;

@CommandParameters(
description = "Ban a player", 
usages = "§cUsage: /ban <name> <reason>",
rank = PlayerRank.MOD)
public class BanCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
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
					player.sendMessage("§cPlayer does not exist.");
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
								player.sendMessage("§aPermanently banned " + args[0] + " for " + reason);
							}

							if (target != null) {
								player.sendMessage("§aPermanently banned " + Bukkit.getPlayer(args[0]).getName() + " for " + reason);
								target.getPlayer().kickPlayer("§cYou are permanently banned from this server!\n\n§7Reason: §f" + playerData.getString(uuid + ".ban.reason") + "\n" + "§7Find out more: §b§n" + Configuration.MUTE_DOMAIN + "\n\n" + "§7Ban ID: §f#" + playerData.getString(uuid + ".ban.id") + "\n" + "§7Sharing your Ban ID may affect the processing of your appeal!");
							}
						} catch (IOException var12) {
							var12.printStackTrace();
						}
					} else {
						player.sendMessage("§cPlayer is already banned!");
					}
				}
			} else {
				player.sendMessage("§cInvalid syntax. Correct: /ban <name> <reason>");
			}
		}
    
}
