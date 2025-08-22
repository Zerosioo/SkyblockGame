package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOT_TERROR_BOOTS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Hot Terror Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HOT_TERROR_BOOTS"; 
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
        return Color.fromRGB(124,68,236);
    }

    @Override
    public int getCritDamage() {
        return 63;
    }

    @Override
    public int getHealth() {
        return 164;
    }

    @Override
    public int getDefense() {
        return 50;
    }

    @Override
    public int getIntelligence() {
        return 6;
    }

    @Override
    public int getSpeed() {
        return 15;
    }

}
