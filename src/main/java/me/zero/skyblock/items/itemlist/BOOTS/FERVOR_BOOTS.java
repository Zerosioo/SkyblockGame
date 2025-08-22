package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FERVOR_BOOTS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Fervor Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FERVOR_BOOTS"; 
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
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getHealth() {
        return 160;
    }

    @Override
    public int getDefense() {
        return 85;
    }

    @Override
    public int getTrueDefense() {
        return 5;
    }

    @Override
    public int getIntelligence() {
        return 5;
    }

}
