package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SALMON_CHESTPLATE extends SItem implements ItemStatistics,ColoredArmor, Sellable, Museum {

    @Override
    public String getName() {
        return "Salmon Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SALMON_CHESTPLATE"; 
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
        return Color.fromRGB(168,43,118);
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 200;
    }

    @Override
    public int getSeaCreatureChance() {
        return 1;
    }

}
