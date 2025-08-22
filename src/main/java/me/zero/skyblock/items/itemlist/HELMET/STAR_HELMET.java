package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STAR_HELMET extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Helmet of the Stars";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STAR_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_HELMET;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNOBTAINABLE;
    }

    @Override
    public int getHealth() {
        return 10000;
    }

    @Override
    public int getDefense() {
        return 3000;
    }

    @Override
    public int getIntelligence() {
        return 1000;
    }

}
