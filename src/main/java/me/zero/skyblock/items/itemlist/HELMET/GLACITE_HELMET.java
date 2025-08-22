package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLACITE_HELMET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Glacite Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GLACITE_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PACKED_ICE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 1750;
    }

    @Override
    public int getDefense() {
        return 70;
    }

    @Override
    public int getTrueDefense() {
        return 5;
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public int getMiningSpeed() {
        return 10;
    }

}
