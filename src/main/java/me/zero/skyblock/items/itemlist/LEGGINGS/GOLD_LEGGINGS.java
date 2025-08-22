package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLD_LEGGINGS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Golden Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLD_LEGGINGS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_LEGGINGS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.LEGGINGS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 14;
    }

    @Override
    public int getDefense() {
        return 15;
    }

}
