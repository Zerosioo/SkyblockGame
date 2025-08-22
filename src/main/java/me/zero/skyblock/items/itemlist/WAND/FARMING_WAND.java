package me.zero.skyblock.items.itemlist.WAND;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FARMING_WAND extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Wand of Farming";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FARMING_WAND"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_HOE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.WAND;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

}
