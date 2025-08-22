package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TINY_HAMMER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "remmaH yniT";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList(".wohemoS")); 
    }

    @Override
    public String getId() {
        return "TINY_HAMMER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_AXE;
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
