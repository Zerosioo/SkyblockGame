package me.zero.skyblock.inventory.inventories.reward;

import me.zero.skyblock.inventory.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class CharlieGUI extends GUI {

    @Override
    public String getTitle() {
        return "Claim Reward";
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
           
           if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Small Storage")) {
           	
           	player.closeInventory();
           	player.sendMessage("§aYou claimed a §8+§f1× Small Storage§a!");
           	// boolean method to save that its claimed & send that item to ur inventory.
        
           }
        
        event.setCancelled(true);
    }

    @Override
    public void onClose(InventoryCloseEvent event) {

    }
    
    

    @Override
    public void setItems() {

        inventory.setItem(22, makeItemOther(Material.CHEST, "§fSmall Storage", 1, 0, "§7Place this chest next to a\n§7minion and the minion will store\n§7items inside once its storage is\n§7full!\n\n§7Storage space: §b3 §7items\n\n§f§lCOMMON\n\n§eClick to claim!"));
        
        inventory.setItem(49, makeItemOther(Material.BARRIER, "§cClose", 1, 0, ""));
        
        for (int slots = 0; slots < getSize(); slots++) {
            if (inventory.getItem(slots) == null) {
                inventory.setItem(slots, FILLER_GLASS);
            }
    }
    }
}