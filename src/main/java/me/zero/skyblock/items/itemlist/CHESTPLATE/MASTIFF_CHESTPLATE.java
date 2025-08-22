package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MASTIFF_CHESTPLATE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Mastiff Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MASTIFF_CHESTPLATE"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getHealth() {
        return 500;
    }

    @Override
    public int getDefense() {
        return -1000000;
    }

}
