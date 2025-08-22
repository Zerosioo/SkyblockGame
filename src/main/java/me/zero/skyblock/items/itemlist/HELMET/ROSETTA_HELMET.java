package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROSETTA_HELMET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Rosetta's Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROSETTA_HELMET"; 
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
    public Gamestage getGamestage() {
        return Gamestage.STARTER;
    }

    @Override
    public int getPrice() {
        return 525;
    }

    @Override
    public int getDefense() {
        return 20;
    }

}
