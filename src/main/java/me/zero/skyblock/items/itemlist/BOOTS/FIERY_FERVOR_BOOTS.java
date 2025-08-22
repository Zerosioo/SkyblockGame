package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIERY_FERVOR_BOOTS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Fiery Fervor Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FIERY_FERVOR_BOOTS"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(7,166,116);
    }

    @Override
    public int getHealth() {
        return 320;
    }

    @Override
    public int getDefense() {
        return 170;
    }

    @Override
    public int getTrueDefense() {
        return 10;
    }

    @Override
    public int getIntelligence() {
        return 10;
    }

}
