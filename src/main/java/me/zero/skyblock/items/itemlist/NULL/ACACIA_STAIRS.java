package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ACACIA_STAIRS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Acacia Wood Stairs";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ACACIA_STAIRS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ACACIA_STAIRS;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

}
