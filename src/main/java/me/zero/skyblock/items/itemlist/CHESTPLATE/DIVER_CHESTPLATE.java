package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIVER_CHESTPLATE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Diver's Shirt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIVER_CHESTPLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_CHESTPLATE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.CHESTPLATE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getPrice() {
        return 20000;
    }

    @Override
    public int getSeaCreatureChance() {
        return 2;
    }

}
