package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SECRET_TRACKER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Secret Tracker 3000";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SECRET_TRACKER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COMPASS;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
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
