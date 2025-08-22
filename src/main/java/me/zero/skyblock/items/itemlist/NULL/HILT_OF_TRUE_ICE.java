package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HILT_OF_TRUE_ICE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Hilt of True Ice";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HILT_OF_TRUE_ICE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ICE;
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

}
