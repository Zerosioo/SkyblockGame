package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GENERALS_ARMOR_OF_THE_RESISTANCE_BOOTS extends SItem implements ItemStatistics,ColoredArmor, Sellable, Museum {

    @Override
    public String getName() {
        return "Boots of the Rising Sun";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GENERALS_ARMOR_OF_THE_RESISTANCE_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_BOOTS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOOTS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(159,134,9);
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 8;
    }

    @Override
    public int getHealth() {
        return 8;
    }

    @Override
    public int getDefense() {
        return 8;
    }

}
