package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GIANT_FRAGMENT_BIGFOOT extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Bigfoot's Lasso";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GIANT_FRAGMENT_BIGFOOT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEASH;
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
    public boolean isDungeonItem() {
      	return true;
    }

}
