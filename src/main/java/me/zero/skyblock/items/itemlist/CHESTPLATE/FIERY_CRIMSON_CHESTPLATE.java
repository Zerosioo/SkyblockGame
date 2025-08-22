package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIERY_CRIMSON_CHESTPLATE extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Fiery Crimson Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FIERY_CRIMSON_CHESTPLATE"; 
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
        return Color.fromRGB(255,111,12);
    }

    @Override
    public int getStrength() {
        return 60;
    }

    @Override
    public int getCritDamage() {
        return 40;
    }

    @Override
    public int getHealth() {
        return 460;
    }

    @Override
    public int getDefense() {
        return 130;
    }

    @Override
    public int getIntelligence() {
        return 10;
    }

}
