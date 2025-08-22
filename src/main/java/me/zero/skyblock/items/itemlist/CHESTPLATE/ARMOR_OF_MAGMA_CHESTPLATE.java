package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARMOR_OF_MAGMA_CHESTPLATE extends SItem implements ItemStatistics,ColoredArmor, Sellable, Museum {

    @Override
    public String getName() {
        return "Armor of Magma Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARMOR_OF_MAGMA_CHESTPLATE"; 
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
        return Color.fromRGB(255,147,0);
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 61000;
    }

    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    public int getDefense() {
        return 30;
    }

}
