package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFERNAL_FERVOR_LEGGINGS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Infernal Fervor Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFERNAL_FERVOR_LEGGINGS"; 
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
        return Color.fromRGB(23,191,137);
    }

    @Override
    public int getHealth() {
        return 529;
    }

    @Override
    public int getDefense() {
        return 290;
    }

    @Override
    public int getTrueDefense() {
        return 12;
    }

    @Override
    public int getIntelligence() {
        return 13;
    }

}
