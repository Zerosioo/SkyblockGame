package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FISH_FOOD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Fish Food";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FISH_FOOD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RAW_FISH;
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
