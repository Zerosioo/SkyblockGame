package me.zero.skyblock.inventory.inventories.reward;

import me.zero.skyblock.inventory.*;
import me.zero.skyblock.user.User;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class LumberJackGUI extends GUI {

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
           
           if (event.getCurrentItem().getItemMeta().getDisplayName().contains("Sweet Axe")) {
           	
           	player.closeInventory();
           	player.getInventory().addItem();
           	player.sendMessage("§aYou claimed a Sweet Axe!");
           	player.sendMessage("");
           	player.sendMessage(" §6§lNEW OBJECTIVE");
    player.sendMessage(" §fTravel to the park behind the woods");
    player.sendMessage("");
           	player.getInventory().addItem(makeItemOther(Material.IRON_AXE, "§aSweet Axe", 1, 0, "§7Damage: §c+25\n\n§a20% §7chance of dropping an Apple\n§7when chopping logs.\n\n§8This item can be reforged!\n§a§lUNCOMMON"));
        User user = User.getUser(player.getUniqueId());
        user.booleanHandler.setBoolean("sweet_axe_claimed", true); 
        user.booleanHandler.setBoolean("travel_to_the_park", true);
        
           }
        
        event.setCancelled(true);
    }

    @Override
    public void onClose(InventoryCloseEvent event) {

    }
    
    

    @Override
    public void setItems() {

        inventory.setItem(22, makeItemOther(Material.IRON_AXE, "§aSweet Axe", 1, 0, "§7Damage: §c+25\n\n§a20% §7chance of dropping an Apple\n§7when chopping logs.\n\n§8This item can be reforged!\n§a§lUNCOMMON\n\n§eClick to claim!"));
        
        inventory.setItem(49, makeItemOther(Material.BARRIER, "§cClose", 1, 0, ""));
        
        for (int slots = 0; slots < getSize(); slots++) {
            if (inventory.getItem(slots) == null) {
                inventory.setItem(slots, FILLER_GLASS);
            }
    }
    }
}