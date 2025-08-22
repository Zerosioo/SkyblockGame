package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NIGHT_SAVER extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Night Saver";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "NIGHT_SAVER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DAYLIGHT_DETECTOR;
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
    public int getPrice() {
        return 35;
    }

}
