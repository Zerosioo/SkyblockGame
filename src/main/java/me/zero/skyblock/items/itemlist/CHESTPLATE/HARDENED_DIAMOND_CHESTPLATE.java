package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HARDENED_DIAMOND_CHESTPLATE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Hardened Diamond Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HARDENED_DIAMOND_CHESTPLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_CHESTPLATE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.CHESTPLATE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 5120;
    }

    @Override
    public int getDefense() {
        return 120;
    }

}
