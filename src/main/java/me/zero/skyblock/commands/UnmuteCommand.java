package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.main.SkyblockGame;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
description = "Unmute a player", 
usages = "§cUsage: /unmute <name>",
rank = PlayerRank.HELPER)
public class UnmuteCommand extends SkyBlockCommand {

    @Override
    public void execute(Player player, String[] args)     {
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
					player.sendMessage("Â§cPlayer does not exist.");
					return;
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
								player.sendMessage("Â§aUnmuted " + Bukkit.getPlayer(args[0]).getName());
							} else {
								player.sendMessage("Â§aUnmuted " + args[0]);
							}
						} catch (IOException var11) {
							var11.printStackTrace();
						}
					} else {
						player.sendMessage("Â§cPlayer is not muted!");
					}
				}
			} else {
				player.sendMessage("Â§cInvalid syntax. Correct: /unmute <name>");
			}
    }
}
