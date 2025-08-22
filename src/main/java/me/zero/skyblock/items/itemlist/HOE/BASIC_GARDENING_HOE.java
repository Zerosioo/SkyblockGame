package me.zero.skyblock.items.itemlist.HOE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BASIC_GARDENING_HOE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Basic Gardening Hoe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BASIC_GARDENING_HOE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_HOE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HOE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public int getFarmingFortune() {
        return 5;
    }

}
