package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STAR_CHESTPLATE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Chestplate of the Stars";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STAR_CHESTPLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_CHESTPLATE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.CHESTPLATE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNOBTAINABLE;
    }

    @Override
    public int getHealth() {
        return 20000;
    }

    @Override
    public int getDefense() {
        return 5000;
    }

    @Override
    public int getIntelligence() {
        return 2000;
    }

}
