package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FERVOR_CHESTPLATE extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Fervor Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FERVOR_CHESTPLATE"; 
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
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getHealth() {
        return 265;
    }

    @Override
    public int getDefense() {
        return 140;
    }

    @Override
    public int getTrueDefense() {
        return 5;
    }

    @Override
    public int getIntelligence() {
        return 5;
    }

}
