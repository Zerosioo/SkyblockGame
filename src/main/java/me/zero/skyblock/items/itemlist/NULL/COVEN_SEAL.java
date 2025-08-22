package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COVEN_SEAL extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Coven Seal";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Given to you by a","powerful vampire,","proving you bested","them in combat.")); 
    }

    @Override
    public String getId() {
        return "COVEN_SEAL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.NETHER_STALK;
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
