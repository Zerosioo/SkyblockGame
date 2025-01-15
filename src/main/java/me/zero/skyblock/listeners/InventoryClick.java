package me.zero.skyblock.listeners;

import me.zero.skyblock.inventory.GUI;
import me.zero.skyblock.main.SkyblockGame;
import me.zero.skyblock.user.User;
import me.zero.skyblock.util.DiscordWebhook;

import java.io.IOException;
import java.util.Arrays;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class InventoryClick implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onClick(InventoryClickEvent e) {
        if (e.getCurrentItem() == null) return;

        InventoryHolder holder = e.getInventory().getHolder();
        if (holder instanceof GUI) {
            GUI GUI = (GUI) holder;
            GUI.onClick(e);
        }
        
        Player player = (Player) e.getWhoClicked();
        User user = User.getUser(player.getUniqueId());
        
                if (e.getCurrentItem().hasItemMeta()) {
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§aSkyblock Menu §7(Right Click)") || e.getCurrentItem().getItemMeta().getDisplayName().equals("§8Quiver Arrow")) {
                // open skyblock menu logic
                e.setCancelled(true);
                return;
            }
          
       }
       
       if (e.getCurrentItem().getItemMeta().getDisplayName() != " " || e.getCurrentItem().getItemMeta().getDisplayName() != null || e.getCurrentItem().getItemMeta().getDisplayName() != "§cClose") {
       
     new BukkitRunnable(){

            public void run() {
                DiscordWebhook webhook = new DiscordWebhook("https://discord.com/api/webhooks/1313856846297301133/-1PndedywQJXe0UvLDVUKQjf-DqQIdpWXGoEHyV08A0kCcXUdSrpddrcTJSu6k_3wSeo");
                webhook.setUsername("GUI Manager");
                webhook.setAvatarUrl("https://media.discordapp.net/attachments/1311748865241907331/1322066977165934703/Red_Stained_Glass.png?ex=677b63d2&is=677a1252&hm=106462fe29fa98ad64fc9e6d46e1e4fc30f2b25b9c18baed4c683d068294d70b&");
                
           webhook.setContent("**" + player.getName() + "** clicked on **" + e.getCurrentItem().getItemMeta().getDisplayName() + "**");
           
                try {
                    webhook.execute();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.runTaskAsynchronously((Plugin)SkyblockGame.getPlugin(SkyblockGame.class));
    
      user.debug("You clicked on " + e.getCurrentItem().getItemMeta().getDisplayName());
     }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onClose(InventoryCloseEvent event) {
        InventoryHolder holder = event.getInventory().getHolder();
        if(holder instanceof GUI) {
            GUI gui = (GUI) holder;
            gui.onClose(event);
        }
    }
}