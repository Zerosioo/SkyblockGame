package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_BREAD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Enchanted Bread";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_BREAD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BREAD;
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
        return 60;
    }

}
