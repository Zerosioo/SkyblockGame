package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARMOR_OF_THE_RESISTANCE_LEGGINGS extends SItem implements ItemStatistics,ColoredArmor, Sellable, Museum {

    @Override
    public String getName() {
        return "Leggings of the Rising Sun";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARMOR_OF_THE_RESISTANCE_LEGGINGS"; 
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
        return Color.fromRGB(222,188,21);
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 14;
    }

    @Override
    public int getHealth() {
        return 12;
    }

    @Override
    public int getDefense() {
        return 12;
    }

}
