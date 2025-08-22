package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GREEN_RECORD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Music Disc - Cat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GREEN_RECORD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GREEN_RECORD;
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
        return 20;
    }

}
