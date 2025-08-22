package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TITAN_BOOTS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Titan's Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TITAN_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_BOOTS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOOTS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNOBTAINABLE;
    }

    @Override
    public int getPrice() {
        return 50000;
    }

    @Override
    public int getStrength() {
        return 10;
    }

    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    public int getDefense() {
        return 100;
    }

    @Override
    public int getIntelligence() {
        return 50;
    }

}
