package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CRYSTAL_CHESTPLATE extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Crystal Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CRYSTAL_CHESTPLATE"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(252,243,255);
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 4000;
    }

    @Override
    public int getDefense() {
        return 35;
    }

    @Override
    public int getIntelligence() {
        return 120;
    }

}
