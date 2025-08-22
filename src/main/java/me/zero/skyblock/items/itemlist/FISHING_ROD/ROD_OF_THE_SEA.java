package me.zero.skyblock.items.itemlist.FISHING_ROD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROD_OF_THE_SEA extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Rod of the Sea";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROD_OF_THE_SEA"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 111000;
    }

    @Override
    public int getFishingSpeed() {
        return 80;
    }

    @Override
    public int getSeaCreatureChance() {
        return 8;
    }

}
