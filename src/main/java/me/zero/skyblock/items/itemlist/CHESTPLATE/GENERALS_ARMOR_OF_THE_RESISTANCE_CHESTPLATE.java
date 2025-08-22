package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GENERALS_ARMOR_OF_THE_RESISTANCE_CHESTPLATE extends SItem implements ItemStatistics, Sellable, Museum {

    @Override
    public String getName() {
        return "Chestplate of the Rising Sun";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GENERALS_ARMOR_OF_THE_RESISTANCE_CHESTPLATE"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 16;
    }

    @Override
    public int getHealth() {
        return 15;
    }

    @Override
    public int getDefense() {
        return 15;
    }

}
