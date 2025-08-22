package me.zero.skyblock.util;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ToolCheckUtil {
    public static boolean isHolding(Player player, String toolName) {
        ItemStack item = player.getItemInHand();
        if (item != null && item.hasItemMeta() && item.getItemMeta().hasDisplayName()) {
            return item.getItemMeta().getDisplayName().equalsIgnoreCase(toolName);
        }
        return false;
    }
}
