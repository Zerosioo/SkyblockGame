package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STAR_LEGGINGS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Leggings of the Stars";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STAR_LEGGINGS"; 
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
        return Rarity.UNOBTAINABLE;
    }

    @Override
    public int getHealth() {
        return 15000;
    }

    @Override
    public int getDefense() {
        return 4000;
    }

    @Override
    public int getIntelligence() {
        return 1500;
    }

}
