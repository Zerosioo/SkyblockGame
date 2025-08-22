package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRE_DIGESTION_FISH extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Pre-Digestion Fish";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("The obvious result","of mixing cat food,","spacetime bending","and mystical","mythology.")); 
    }

    @Override
    public String getId() {
        return "PRE_DIGESTION_FISH"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

}
