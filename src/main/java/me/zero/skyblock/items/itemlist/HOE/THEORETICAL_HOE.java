package me.zero.skyblock.items.itemlist.HOE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class THEORETICAL_HOE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Mathematical Hoe Blueprint";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "THEORETICAL_HOE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOD_HOE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HOE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

}
