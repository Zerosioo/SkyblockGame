package me.zero.skyblock.inventory.inventories.npcmenus;

import me.zero.skyblock.inventory.*;
import me.zero.skyblock.util.SUtil;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.Sound;

public class HubSelectorGUI extends GUI {

    @Override
    public String getTitle() {
        return "SkyBlock Hub Selector";
    }

    @Override
    public int getSize() {
        return 54;
    }

    @Override
    public void onClick(InventoryClickEvent event) {
    	
    	

           if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Close")) {
           	
           	player.closeInventory();
        
           }
           
           if (event.getCurrentItem().getItemMeta().getDisplayName().contains("SkyBlock Hub #1")) {
           	
           	player.sendMessage("§cYou're already connected to this server!");
           	player.closeInventory();
           	player.playSound(player.getLocation(), Sound.VILLAGER_NO, 1.0f, 1.0f);
        
           }
           
           if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Random Hub")) {
           	
           	player.sendMessage("§cThere is only one server!");
           	player.closeInventory();
           	player.playSound(player.getLocation(), Sound.VILLAGER_NO, 1.0f, 1.0f);
        
           }
           
        event.setCancelled(true);
           
    }

    @Override
    public void onClose(InventoryCloseEvent event) {

    }

    @Override
    public void setItems() {
    	SUtil s = new SUtil();

        inventory.setItem(10, makeItemOther(Material.STAINED_CLAY, "§cSkyBlock Hub #1", 1, 14, "§7Players: " + Bukkit.getOnlinePlayers().size() + "/80\n§8Server: " + s.getMegaServer() + "\n\n§cAlready connected!" ));
        
        inventory.setItem(49, makeItemOther(Material.BARRIER, "§cClose", 1, 0, ""));
        inventory.setItem(50, makeItemOther(Material.COMPASS, "§aRandom Hub", 1, 0, "§7Have no strong feelings one way\n§7or the other?\n\n§7Hub Servers: §a1\n§7Current: §3skyblockhub-1 §7(" + Bukkit.getOnlinePlayers().size() + "/80)\n\n§bRight-Click for small server!\n§eClick to join a random hub!"));
        
        fillBorder();
        
        
      
    
    }
    
}