package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARMOR_OF_YOG_CHESTPLATE extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Yog Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARMOR_OF_YOG_CHESTPLATE"; 
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
        return Color.fromRGB(200,50,0);
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getPrice() {
        return 38000;
    }

    @Override
    public int getHealth() {
        return 50;
    }

    @Override
    public int getDefense() {
        return 15;
    }

    @Override
    public int getMiningFortune() {
        return 20;
    }

    @Override
    public int getMiningSpeed() {
        return 25;
    }

}
