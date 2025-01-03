package me.zero.skyblock.listeners;

import me.zero.skyblock.main.SkyblockGame;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener {
	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		File playerfile = new File(SkyblockGame.getPlugin(SkyblockGame.class).getDataFolder() + File.separator, "punishments.yml");
		FileConfiguration playerData = YamlConfiguration.loadConfiguration(playerfile);
		String uuid = event.getPlayer().getUniqueId().toString();
		long unixTime = System.currentTimeMillis() / 1000L;
		if (playerData.contains(uuid) && playerData.getBoolean(uuid + ".mute.ismuted")) {
			if ((long)playerData.getInt(uuid + ".mute.length") <= unixTime) {
				try {
					playerData.set(uuid + ".mute.ismuted", false);
					playerData.set(uuid + ".mute.reason", "");
					playerData.set(uuid + ".mute.length", 0);
					playerData.set(uuid + ".mute.id", "");
					playerData.save(playerfile);
				} catch (IOException var9) {
					var9.printStackTrace();
				}
			}

			if (playerData.getInt(uuid + ".mute.length") <= 0) {
				return;
			}

			player.sendMessage("§c§l§m---------------------------------------------");
			player.sendMessage("§cYou are currently muted for " + playerData.getString(uuid + ".mute.reason") + ".");
			player.sendMessage("§7Your mute will expire in §c" + calculateTime((long)playerData.getInt(uuid + ".mute.length") - unixTime));
			player.sendMessage("");
			player.sendMessage("§7Find out more here: §e" + ((SkyblockGame)SkyblockGame.getPlugin(SkyblockGame.class)).getConfig().getString("mutedomain"));
			player.sendMessage("§7Mute ID: §f#" + playerData.getString(uuid + ".mute.id"));
			player.sendMessage("§c§l§m---------------------------------------------");
			event.setCancelled(true);
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
}
