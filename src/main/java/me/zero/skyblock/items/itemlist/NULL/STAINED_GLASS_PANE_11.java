package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STAINED_GLASS_PANE_11 extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Blue Stained Glass Pane";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STAINED_GLASS_PANE:11"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STAINED_GLASS_PANE;
    }

    @Override
    public byte getDurability() {
        return 11;
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
