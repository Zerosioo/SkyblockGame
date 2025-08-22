package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REED_BOAT extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Rift Boat";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Built by Reed, who","turns out to be a","bit of a scammer.")); 
    }

    @Override
    public String getId() {
        return "REED_BOAT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOAT;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

}
