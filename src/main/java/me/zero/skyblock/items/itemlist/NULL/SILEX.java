package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILEX extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Sharp Rock";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7A sharp rock with","§7sturdy","§7construction.")); 
    }

    @Override
    public String getId() {
        return "SILEX"; 
    }

    @Override
    public Material getMaterial() {
        return Material.QUARTZ;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

}
