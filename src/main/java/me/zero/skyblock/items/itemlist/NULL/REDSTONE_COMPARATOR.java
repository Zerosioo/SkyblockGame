package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REDSTONE_COMPARATOR extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Comparator";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REDSTONE_COMPARATOR"; 
    }

    @Override
    public Material getMaterial() {
        return Material.REDSTONE_COMPARATOR;
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
    public int getPrice() {
        return 5;
    }

}
