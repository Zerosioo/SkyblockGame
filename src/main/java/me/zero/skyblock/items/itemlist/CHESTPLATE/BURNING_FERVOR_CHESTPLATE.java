package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURNING_FERVOR_CHESTPLATE extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Burning Fervor Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BURNING_FERVOR_CHESTPLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_CHESTPLATE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.CHESTPLATE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(240,71,41);
    }

    @Override
    public int getHealth() {
        return 421;
    }

    @Override
    public int getDefense() {
        return 222;
    }

    @Override
    public int getTrueDefense() {
        return 8;
    }

    @Override
    public int getIntelligence() {
        return 8;
    }

}
