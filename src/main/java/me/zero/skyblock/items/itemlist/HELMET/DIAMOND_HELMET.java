package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_HELMET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Diamond Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_HELMET;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public int getDefense() {
        return 15;
    }

}
