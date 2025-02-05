package me.zero.skyblock.listeners;

import me.zero.skyblock.Configuration;
import me.zero.skyblock.main.SkyblockGame;
import me.zero.skyblock.misc.PlayerInformation;
import me.zero.skyblock.misc.Reboot;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.user.User;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener {
	private final Map<Player, Long> chatCooldowns = new HashMap<>();
    private final Map<Player, String> lastMessages = new HashMap<>();
    
    public PlayerChat() {
        
        
       new PlayerInformation().start();
       new Reboot().delayed();
        
    }
    
	@EventHandler
	public void onChat(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		User user = User.getUser(player.getUniqueId());
		long currentTime = System.currentTimeMillis();
		
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
			player.sendMessage("§7Find out more here: §e" + Configuration.MUTE_DOMAIN);
			player.sendMessage("§7Mute ID: §f#" + playerData.getString(uuid + ".mute.id"));
			player.sendMessage("§c§l§m---------------------------------------------");
			event.setCancelled(true);
		}
		
		if (user.booleanHandler.getBoolean("messagebuilder") == true) {
        	event.setCancelled(true);
        	player.sendMessage(ChatColor.translateAlternateColorCodes('&', event.getMessage()));
        	return;
        }

        String currentMessage = event.getMessage();
        if (lastMessages.containsKey(player) && lastMessages.get(player).equalsIgnoreCase(currentMessage)) {
            event.setCancelled(true);
            player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "" + ChatColor.STRIKETHROUGH + "-----------------------------------------");
            player.sendMessage(ChatColor.RED + "You cannot say the same message twice!");
            player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "" + ChatColor.STRIKETHROUGH + "-----------------------------------------");
        } else {
            lastMessages.put(player, currentMessage);
            chatCooldowns.put(player, currentTime);
        }

	}
	
	@EventHandler(priority = EventPriority.LOW)
    public void Event(AsyncPlayerChatEvent e) {
        User data = User.getUser(e.getPlayer());
        e.setFormat("%1$s" + (data.rank == PlayerRank.DEFAULT ? ChatColor.GRAY : ChatColor.WHITE) + ": %2$s");
        e.getPlayer().setDisplayName(e.getPlayer().getName());
        
        Player player = e.getPlayer();
        User user = User.getUser(player.getUniqueId());
        user.load();

        // Initial rank and level prefix setup
        PlayerRank rank = user.rank;
        String colour = rank.getColour();
        String levelPrefix = user.LevelPrefix();

        String initialName = levelPrefix + " " + colour + player.getName();
        
        if (!e.getPlayer().getDisplayName().equals(ChatColor.translateAlternateColorCodes('&', initialName))) {
            e.getPlayer().setDisplayName(ChatColor.translateAlternateColorCodes('&', initialName));
        }
        if (rank.isAboveOrEqual(PlayerRank.MVPPLUSPLUS)) {
            e.setMessage(e.getMessage().replace("<3", "§c❤").replace("⭐", "§6✭").replace(":owo:", "§dO§5w§dO").replace("o/", "§d(/◕ヮ◕)/").replace(":OOF:", "§c§lOOF").replace(":123:", "§a1§e2§c3").replace(":shrug:", "§e¯\\(ツ)/¯").replace(":yes:", "§a✔").replace(":no:", "§c✖").replace(":java:", "§b♨").replace(":arrow:", "§e➡").replace(":typing:", "§e✎§6..."));
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
