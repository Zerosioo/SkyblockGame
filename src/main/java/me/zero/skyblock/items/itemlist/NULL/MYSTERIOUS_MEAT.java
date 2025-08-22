package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MYSTERIOUS_MEAT extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Mysterious Meat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MYSTERIOUS_MEAT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ROTTEN_FLESH;
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

}
