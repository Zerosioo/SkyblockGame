package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FROZEN_WATER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Frozen Water";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("One could say","it's... ice cold.")); 
    }

    @Override
    public String getId() {
        return "FROZEN_WATER"; 
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
        return Rarity.RARE;
    }

}
