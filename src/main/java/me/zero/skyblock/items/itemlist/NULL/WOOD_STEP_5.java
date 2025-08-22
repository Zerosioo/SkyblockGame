package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WOOD_STEP_5 extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Dark Oak Wood Slab";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WOOD_STEP:5"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOD_STEP;
    }

    @Override
    public byte getDurability() {
        return 5;
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
