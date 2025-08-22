package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFERNAL_HOLLOW_BOOTS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Infernal Hollow Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFERNAL_HOLLOW_BOOTS"; 
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
        return Color.fromRGB(227,255,250);
    }

    @Override
    public int getHealth() {
        return 366;
    }

    @Override
    public int getDefense() {
        return 110;
    }

    @Override
    public int getIntelligence() {
        return 214;
    }

    @Override
    public int getSpeed() {
        return 13;
    }

}
