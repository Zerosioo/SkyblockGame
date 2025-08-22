package me.zero.skyblock.items.itemlist.PET_ITEM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DEAD_CAT_FOOD extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Dead Cat Food";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DEAD_CAT_FOOD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COOKED_FISH;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.PET_ITEM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
