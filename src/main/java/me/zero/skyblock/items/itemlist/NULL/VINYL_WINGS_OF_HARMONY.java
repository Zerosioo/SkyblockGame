package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VINYL_WINGS_OF_HARMONY extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Wings of Harmony Vinyl";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VINYL_WINGS_OF_HARMONY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RECORD_12;
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
        return 50000;
    }

}
