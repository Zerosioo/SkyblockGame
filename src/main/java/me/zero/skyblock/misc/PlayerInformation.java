package me.zero.skyblock.misc;

import org.bukkit.entity.Player;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import me.zero.skyblock.Configuration;
import me.zero.skyblock.main.SkyblockGame;

public class PlayerInformation {
	private final String storeDomain = Configuration.STORE_DOMAIN;
    private final String youtubeLink = Configuration.YOUTUBE_LINK;
	
	public void start() {
		new BukkitRunnable() {
            @Override
            public void run() {
                
                Bukkit.broadcastMessage("");
                Bukkit.broadcastMessage(ChatColor.AQUA + "[PLAYER INFORMATION]");
                Bukkit.broadcastMessage(ChatColor.GOLD + "➤ " + ChatColor.WHITE + "If you want to support the server,");
                Bukkit.broadcastMessage(ChatColor.WHITE + "you can purchase a rank on our store!");
                Bukkit.broadcastMessage(ChatColor.YELLOW + storeDomain);

                
                TextComponent clickMessage = new TextComponent(ChatColor.GOLD + "" + ChatColor.BOLD + "CLICK HERE");
                clickMessage.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, storeDomain));
                for (Player player : Bukkit.getOnlinePlayers()) {
                    player.spigot().sendMessage(clickMessage);
                    Bukkit.broadcastMessage("");
                }
            }
        }.runTaskTimer(SkyblockGame.getPlugin(SkyblockGame.class), 0L, 12 * 60 * 20L); // 12 mins
        
        new BukkitRunnable() {
            @Override
            public void run() {
                
                Bukkit.broadcastMessage("");
                Bukkit.broadcastMessage(ChatColor.AQUA + "[PLAYER INFORMATION]");
                Bukkit.broadcastMessage(ChatColor.WHITE + "Have a question? Our help menu may have your answer!");
                Bukkit.broadcastMessage(ChatColor.WHITE + "Type" + ChatColor.AQUA + " /help " + ChatColor.WHITE + "and follow the prompts to report them.");
                Bukkit.broadcastMessage(ChatColor.WHITE + "and look through our many helpful links.");
                Bukkit.broadcastMessage("");
                Bukkit.broadcastMessage("");
            }
        }.runTaskTimer(SkyblockGame.getPlugin(SkyblockGame.class), 0L, 10 * 60 * 20L); // Every 10 mins
        
        new BukkitRunnable() {
        	@Override
        	public void run() {
        		Bukkit.broadcastMessage("");
        		Bukkit.broadcastMessage(ChatColor.AQUA + "[PLAYER INFORMATION]");
        		Bukkit.broadcastMessage(ChatColor.WHITE + "Subscribe to the project on " + ChatColor.BOLD + "Youtube");
        		Bukkit.broadcastMessage(ChatColor.YELLOW + youtubeLink);
        		
        		TextComponent clickMessage = new TextComponent(ChatColor.GREEN + "" + ChatColor.BOLD + "CLICK HERE");
                clickMessage.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, youtubeLink));
                for (Player player : Bukkit.getOnlinePlayers()) {
                    player.spigot().sendMessage(clickMessage);
                    Bukkit.broadcastMessage("");
                }
        	}
        }.runTaskTimer(SkyblockGame.getPlugin(SkyblockGame.class), 0L, 14 * 60 * 20L); // Every 14 Mins
        
        new BukkitRunnable() {
        	@Override
        	public void run() {
        		Bukkit.broadcastMessage("");
        		Bukkit.broadcastMessage(ChatColor.AQUA + "[PLAYER INFORMATION]");
        		Bukkit.broadcastMessage("Want to get most out of the game?");
        		Bukkit.broadcastMessage(ChatColor.AQUA + "Check out our shop " + ChatColor.WHITE + "and enjoy the best combination of");
        		Bukkit.broadcastMessage(ChatColor.WHITE + "price and quality, get access to a variety of");
        		Bukkit.broadcastMessage(ChatColor.AQUA + "unique features " + ChatColor.WHITE + "and additional bonuses!");
        		Bukkit.broadcastMessage("");
        	}
        }.runTaskTimer(SkyblockGame.getPlugin(SkyblockGame.class), 0L, 7 * 60 * 20L); // Every 7 minutes
        
        new BukkitRunnable() {
        	@Override
        	public void run() {
        		Bukkit.broadcastMessage("");
        		Bukkit.broadcastMessage(ChatColor.AQUA + "[PLAYER INFORMATION]");
        		Bukkit.broadcastMessage(ChatColor.WHITE + "Have you found a cheater? Let us know!");
        		Bukkit.broadcastMessage(ChatColor.WHITE + "Use " + ChatColor.AQUA + "/report " + ChatColor.WHITE + "and follow the prompts.");
        		Bukkit.broadcastMessage("");
        	}
        }.runTaskTimer(SkyblockGame.getPlugin(SkyblockGame.class), 0L, 15 * 60 * 20L); // 15 mins
        
	}
}