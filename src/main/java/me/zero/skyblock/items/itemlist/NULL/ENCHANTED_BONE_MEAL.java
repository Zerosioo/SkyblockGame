package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_BONE_MEAL extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Enchanted Bone Meal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_BONE_MEAL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 15;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
