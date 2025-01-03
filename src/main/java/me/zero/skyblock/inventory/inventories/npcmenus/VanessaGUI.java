package me.zero.skyblock.inventory.inventories.npcmenus;

import me.zero.skyblock.inventory.GUI;
import me.zero.skyblock.user.User;
import me.zero.skyblock.main.SkyblockGame;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class VanessaGUI extends GUI {

    @Override
    public String getTitle() {
        return "Vanessa";
    }

    @Override
    public int getSize() {
        return 36;
    }

    @Override
    public void onClick(InventoryClickEvent event) {
        if (event.getCurrentItem() == null || !event.getCurrentItem().hasItemMeta()) {
            event.setCancelled(true);
            return;
        }

        Player player = (Player) event.getWhoClicked();
        User user = User.getUser(player);

        String itemName = event.getCurrentItem().getItemMeta().getDisplayName();
        if (itemName.contains("Close")) {
            player.closeInventory();
        }

        if (itemName.contains("The Rainmaker")) {
                    player.sendMessage("§eYou can't stack up more rain than this!");
                    player.sendMessage("§cYou need at least §65,000 coins §8to use The Rainmaker!");
                    player.sendMessage("§eYou added a minute of rain! §a1 §eminutes of rain left!");
                    player.playSound(player.getLocation(), Sound.NOTE_PLING, 1.0f, 1.0f);
                    player.closeInventory();
                }
               
    }

    @Override
    public void onClose(InventoryCloseEvent event) {
        // No action needed
    }

    @Override
    public void setItems() {
        inventory.setItem(13, makeItemOther(
            Material.WATER_BUCKET,
            "§bThe Rainmaker",
            1,
            0,
            "§7For a few coins, I'll conjure\n§7the rain!\n\n" +
            "§7One minute of rain: §65,000 coins\n\n" +
            "§8The SkyBlock community spent a\n§8combined 0 coins on rain."
        ));

        inventory.setItem(31, makeItemOther(Material.BARRIER, "§cClose", 1, 0, ""));

        for (int slots = 0; slots < getSize(); slots++) {
            if (inventory.getItem(slots) == null) {
                inventory.setItem(slots, FILLER_GLASS);
            }
        }
    }
}
