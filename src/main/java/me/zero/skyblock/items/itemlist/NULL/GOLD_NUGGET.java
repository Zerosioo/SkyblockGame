package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLD_NUGGET extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Gold Nugget";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLD_NUGGET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_NUGGET;
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
