package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOT_CRIMSON_LEGGINGS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Hot Crimson Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HOT_CRIMSON_LEGGINGS"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(230,97,5);
    }

    @Override
    public int getStrength() {
        return 38;
    }

    @Override
    public int getCritDamage() {
        return 25;
    }

    @Override
    public int getHealth() {
        return 258;
    }

    @Override
    public int getDefense() {
        return 69;
    }

    @Override
    public int getIntelligence() {
        return 6;
    }

}
