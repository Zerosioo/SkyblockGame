package me.zero.skyblock.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.plugin.Plugin;

import me.zero.skyblock.main.SkyblockGame;
import me.zero.skyblock.ranks.PlayerRank;
import me.zero.skyblock.user.User;
import me.zero.skyblock.util.DiscordWebhook;

import java.io.IOException;
import java.lang.reflect.Field;

public class ServerPingListener extends PListener
{

    @EventHandler
    public void onServerPing(ServerListPingEvent e)
    {
        FileConfiguration config = SkyblockGame.getInstance().getConfig();
        
        if (config.getBoolean("Maintenance")) {
        e.setMotd("            §aHyblixel Network §c[1.8-1.17]§r\n       §c§lSERVER UNDER MAINTENANCE");
        e.setMaxPlayers(1);
        try {
                Field versionNameField = e.getClass().getDeclaredField("serverName");
                versionNameField.setAccessible(true);
                versionNameField.set(e, ChatColor.RED + "Maintenance");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        else { e.setMotd("        §aHyblixel Network §c[1.8-1.17]§r\n       §c§lWORK UNDER PROGRESS."); 
        e.setMaxPlayers(100);
        try {
                Field versionNameField = e.getClass().getDeclaredField("serverName");
                versionNameField.setAccessible(true);
                versionNameField.set(e, ChatColor.RED + "§cHyblixel Network [1.8-1.20]");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    @EventHandler
    public void onPlayerJoinM(PlayerJoinEvent event) {
        FileConfiguration config = SkyblockGame.getInstance().getConfig();
        Player player = event.getPlayer();
        User user = User.getUser(player.getUniqueId());
        PlayerRank rank = user.rank;
        
        if (config.getBoolean("Maintenance") && rank.isBelowOrEqual(PlayerRank.YOUTUBE)) {
            player.kickPlayer("§cWe are sorry but Hyblixel Network is currently down for maintenance.\n\n§cFor more information join our §bDiscord§c.\n§c");
            user.debug("§aPlayer §c" + player.getName() + "§atried to join but was restricted access because of maintenance.");
            
            new BukkitRunnable(){

            public void run() {
                DiscordWebhook webhook = new DiscordWebhook("https://discord.com/api/webhooks/1335514232933843057/A0vvdpxD6IWK20JCMxFXqH4dR34H4GXkGwt8LE6qNb-7_fPavtnvwUEAOHtrbvKT1b6d");
                webhook.setUsername("MAINTENANCE");
                webhook.setAvatarUrl("https://media.discordapp.net/attachments/1311748865241907331/1322066977165934703/Red_Stained_Glass.png?ex=677b63d2&is=677a1252&hm=106462fe29fa98ad64fc9e6d46e1e4fc30f2b25b9c18baed4c683d068294d70b&");
                
                DiscordWebhook.EmbedObject embed = new DiscordWebhook.EmbedObject()
                    .setTitle("Maintenance Mode")
                    .setDescription("`" + player.getName() + "` tried to join but was restricted access because of maintenance.\n" + "IP Address:**" + Bukkit.getIp() + "**\nPort:**" + Bukkit.getPort() + "**");
      
            webhook.addEmbed(embed);
            
          // webhook.setContent("**" + player.getName() + "** tried to join but was restricted access because of maintenance." + "IP Address:**" + Bukkit.getIp() + "** Port:**" + Bukkit.getPort() + "**");
           
                try {
                    webhook.execute();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.runTaskAsynchronously((Plugin)SkyblockGame.getPlugin(SkyblockGame.class));
        }
    }
}