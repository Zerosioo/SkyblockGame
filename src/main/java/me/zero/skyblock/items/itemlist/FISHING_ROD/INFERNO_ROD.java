package me.zero.skyblock.items.itemlist.FISHING_ROD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFERNO_ROD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Inferno Rod";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFERNO_ROD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FISHING_ROD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.FISHING_ROD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 1028000;
    }

    @Override
    public int getFishingSpeed() {
        return 50;
    }

    @Override
    public int getSeaCreatureChance() {
        return 10;
    }

}
