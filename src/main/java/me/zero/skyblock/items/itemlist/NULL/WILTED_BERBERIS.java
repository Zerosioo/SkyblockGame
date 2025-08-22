package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WILTED_BERBERIS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Wilted Berberis";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("The plant equivalent","of an alien zombie.")); 
    }

    @Override
    public String getId() {
        return "WILTED_BERBERIS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DEAD_BUSH;
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
