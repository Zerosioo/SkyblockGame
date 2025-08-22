package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REFINED_BOTTLE_OF_JYRRE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Refined Bottle of Jyrre";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REFINED_BOTTLE_OF_JYRRE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.POTION;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 30000;
    }

}
