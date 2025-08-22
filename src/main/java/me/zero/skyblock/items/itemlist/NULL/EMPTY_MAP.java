package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EMPTY_MAP extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Empty Map";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EMPTY_MAP"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EMPTY_MAP;
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
        return 25;
    }

}
