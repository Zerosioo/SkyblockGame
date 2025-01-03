package me.zero.skyblock.listeners;

import org.bukkit.entity.Player;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle.EnumTitleAction;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Map;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import me.zero.skyblock.main.SkyblockGame;

public class ChatListener implements Listener {

    private final Map<Player, Long> chatCooldowns = new HashMap<>();
    private final Map<Player, String> lastMessages = new HashMap<>();
    private final String storeDomain = ((SkyblockGame) SkyblockGame.getPlugin(SkyblockGame.class)).getConfig().getString("storedomain");
    private final String youtubeLink = ((SkyblockGame) SkyblockGame.getPlugin(SkyblockGame.class)).getConfig().getString("youtubelink");
    

    public ChatListener() {
        
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
        
        // Start the reboot countdown after a delay of 2.5 hours
        new BukkitRunnable() {
            @Override
            public void run() {
                startRebootCountdown();
            }
        }.runTaskLater(SkyblockGame.getPlugin(SkyblockGame.class), 9000 * 20L); // 2.5 hours delay 

    }
    
    
    private void startRebootCountdown() {
        new BukkitRunnable() {
            int countdown = 60;

            @Override
            public void run() {
                if (countdown == 0) {
                    Bukkit.broadcastMessage("§eServer is §cShutting down§e!");
                    Bukkit.shutdown();
                    cancel();
                    return;
                }

                if (countdown == 10 || countdown == 30 || countdown == 60) {
                    String title = "§c§lSERVER REBOOT!";
                    String subtitle = ChatColor.YELLOW + "Scheduled Reboot" + ChatColor.GRAY + " (in 0:" + countdown + ")";

                    for (Player player : Bukkit.getOnlinePlayers()) {
                        sendTitle(player, title, subtitle);
                    }

                    Bukkit.broadcastMessage(ChatColor.RED + "[Important]" + ChatColor.YELLOW + " This server will restart soon: " + ChatColor.AQUA + "Scheduled Reboot");
                    Bukkit.broadcastMessage(ChatColor.YELLOW + "You have " + ChatColor.GREEN + countdown + "s " + ChatColor.YELLOW + "to evacuate! Please reconnect to " + ChatColor.AQUA + ((SkyblockGame)SkyblockGame.getPlugin(SkyblockGame.class)).getConfig().getString("serverdomain"));
                }

                countdown--;
            }
        }.runTaskTimer(SkyblockGame.getPlugin(SkyblockGame.class), 0L, 20L); // Countdown every second
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        long currentTime = System.currentTimeMillis();

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
    
    private void sendTitle(Player player, String title, String subtitle) {
        CraftPlayer craftPlayer = (CraftPlayer) player;
        IChatBaseComponent chatTitle = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + title + "\"}");
        IChatBaseComponent chatSubtitle = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + subtitle + "\"}");

        PacketPlayOutTitle titlePacket = new PacketPlayOutTitle(EnumTitleAction.TITLE, chatTitle);
        PacketPlayOutTitle subtitlePacket = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, chatSubtitle);

        craftPlayer.getHandle().playerConnection.sendPacket(titlePacket);
        craftPlayer.getHandle().playerConnection.sendPacket(subtitlePacket);
    }
}
