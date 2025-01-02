package me.zero.skyblock.listeners;

import me.zero.skyblock.inventory.GUI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.InventoryHolder;

public class InventoryClick implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onClick(InventoryClickEvent e) {
        if (e.getCurrentItem() == null) return;

        InventoryHolder holder = e.getInventory().getHolder();
        if (holder instanceof GUI) {
            GUI GUI = (GUI) holder;
            GUI.onClick(e);
        }
        
                if (e.getCurrentItem().hasItemMeta()) {
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§aSkyblock Menu §7(Right Click)") || e.getCurrentItem().getItemMeta().getDisplayName().equals("§8Quiver Arrow")) {
                // open skyblock menu logic
                e.setCancelled(true);
                return;
            }
          
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