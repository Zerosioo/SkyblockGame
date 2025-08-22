package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BROWN_MUSHROOM extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Brown Mushroom";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BROWN_MUSHROOM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BROWN_MUSHROOM;
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
    public int getPrice() {
        return 10;
    }

}
