package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QUARTZ_STAIRS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Quartz Stairs";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "QUARTZ_STAIRS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.QUARTZ_STAIRS;
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
        return 2;
    }

}
