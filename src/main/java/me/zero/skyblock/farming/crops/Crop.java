package me.zero.skyblock.farming.crops;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.zero.skyblock.farming.data.CustomDropResult;

import java.util.List;

public interface Crop {
    List<ItemStack> getRegularDrops(Player player, boolean doubleChance);
    List<CustomDropResult> getCustomDrops(Player player, boolean doubleChance);
    int getRewardedXP();
    Material getMaterial();
}
