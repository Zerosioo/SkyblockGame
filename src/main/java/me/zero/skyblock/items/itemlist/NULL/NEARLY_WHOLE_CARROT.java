package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NEARLY_WHOLE_CARROT extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Nearly-Whole Carrot";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("The whole is better","than the sum of its","parts...")); 
    }

    @Override
    public String getId() {
        return "NEARLY_WHOLE_CARROT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CARROT_ITEM;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

}
