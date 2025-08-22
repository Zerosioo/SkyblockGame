package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STARRED_ADAPTIVE_LEGGINGS extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Adaptive Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STARRED_ADAPTIVE_LEGGINGS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_LEGGINGS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.LEGGINGS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(191,188,178);
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getGearScore() {
        return 50;
    }

    @Override
    public int getPrice() {
        return 20000;
    }

    @Override
    public int getStrength() {
        return 15;
    }

    @Override
    public int getHealth() {
        return 155;
    }

    @Override
    public int getDefense() {
        return 75;
    }

    @Override
    public int getIntelligence() {
        return 15;
    }

}
