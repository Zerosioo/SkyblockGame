package me.zero.skyblock.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.zero.skyblock.main.SkyblockGame;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang.RandomStringUtils;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import me.zero.skyblock.commands.abstraction.*;
import me.zero.skyblock.ranks.PlayerRank;

@CommandParameters(
description = "Mute Someons", 
usages = "§cUsage: /mute <name> <length> <reason>",
rank = PlayerRank.HELPER)
public class MuteCommand extends SkyBlockCommand {
	private static final Pattern
	
	periodPattern = Pattern.compile("([0-9]+)([hdwmy])");

    @Override
    public void execute(Player player, String[] args)     {
       if (args.length >= 3) {
				String reason = "";

				for(int i = 2; i < args.length; ++i) {
					reason = reason + args[i] + " ";
				}

				reason = reason.substring(0, reason.length() - 1);
				Player target = Bukkit.getPlayerExact(args[0]);
				File playerfile = new File(((SkyblockGame)SkyblockGame.getPlugin(SkyblockGame.class)).getDataFolder() + File.separator, "punishments.yml");
				FileConfiguration playerData = YamlConfiguration.loadConfiguration(playerfile);
				String uuid = null;
				if (target != null) {
					uuid = target.getPlayer().getUniqueId().toString();
				}

				if (uuid == null) {
					Iterator var11 = playerData.getKeys(false).iterator();

					while(var11.hasNext()) {
						String key = (String)var11.next();
						if (playerData.getString(key + ".name").equalsIgnoreCase(args[0])) {
							uuid = key;
						}
					}
				}

				if (uuid == null) {
					player.sendMessage("§cPlayer does not exist.");
					return;
				}

				long unixTime = System.currentTimeMillis() / 1000L;
				long muteTime = parsePeriod(args[1]) / 1000L - 1L;
				if (muteTime < 59L) {
					player.sendMessage("§cYou can not mute someone for less than 1 minute.");
					return;
				}

				if (playerData.contains(uuid)) {
					if (!playerData.getBoolean(uuid + ".mute.ismuted")) {
						try {
							playerData.set(uuid + ".mute.ismuted", true);
							playerData.set(uuid + ".mute.reason", reason);
							playerData.set(uuid + ".mute.length", unixTime + muteTime);
							String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
							String pwd = RandomStringUtils.random(8, characters);
							playerData.set(uuid + ".mute.id", pwd);
							playerData.save(playerfile);
							if (target != null) {
								player.sendMessage("§aMuted " + Bukkit.getPlayer(args[0]).getName() + " for " + args[1] + " for " + reason);
								target.sendMessage("§c§l§m---------------------------------------------");
								target.sendMessage("§cYou are currently muted for " + reason + ".");
								target.sendMessage("§7Your mute will expire in §c" + calculateTime((long)playerData.getInt(uuid + ".mute.length") - unixTime));
								target.sendMessage("");
								target.sendMessage("§7Find out more here: §e" + ((SkyblockGame)SkyblockGame.getPlugin(SkyblockGame.class)).getConfig().getString("mutedomain"));
								target.sendMessage("§7Mute ID: §f#" + playerData.getString(uuid + ".mute.id"));
								target.sendMessage("§c§l§m---------------------------------------------");
							} else {
								player.sendMessage("§aMuted " + args[0] + " for " + args[1] + " for " + reason);
							}
						} catch (IOException var16) {
							var16.printStackTrace();
						}
					} else {
						player.sendMessage("§cPlayer is already muted!");
					}
				}
			} else {
				player.sendMessage("§cInvalid syntax. Correct: /mute <name> <length> <reason>");
			}
    }
    
    public static String calculateTime(long seconds) {
		int days = (int)TimeUnit.SECONDS.toDays(seconds);
		long hours = TimeUnit.SECONDS.toHours(seconds) - (long)(days * 24);
		long minute = TimeUnit.SECONDS.toMinutes(seconds) - TimeUnit.SECONDS.toHours(seconds) * 60L;
		long second = TimeUnit.SECONDS.toSeconds(seconds) - TimeUnit.SECONDS.toMinutes(seconds) * 60L;
		String time = (" " + days + "d " + hours + "h " + minute + "m " + second + "s").toString().replace(" 0d", "").replace(" 0h", "").replace(" 0m", "").replace(" 0s", "").replaceFirst(" ", "");
		return time;
	}

	public static Long parsePeriod(String period) {
		if (period == null) {
			return null;
		} else {
			period = period.toLowerCase(Locale.ENGLISH);
			Matcher matcher = periodPattern.matcher(period);
			Instant instant = Instant.EPOCH;

			while(matcher.find()) {
				int num = Integer.parseInt(matcher.group(1));
				String typ = matcher.group(2);
				switch(typ.hashCode()) {
					case 100:
						if (typ.equals("d")) {
							instant = instant.plus(Duration.ofDays((long)num));
						}
						break;
					case 104:
						if (typ.equals("h")) {
							instant = instant.plus(Duration.ofHours((long)num));
						}
						break;
					case 109:
						if (typ.equals("m")) {
							instant = instant.plus(Duration.ofMinutes((long)num));
						}
				}
			}

			return instant.toEpochMilli();
		}
	}
}
