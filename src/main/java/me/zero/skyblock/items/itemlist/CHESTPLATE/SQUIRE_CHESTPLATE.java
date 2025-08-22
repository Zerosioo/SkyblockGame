package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SQUIRE_CHESTPLATE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Squire Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SQUIRE_CHESTPLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_CHESTPLATE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.CHESTPLATE;
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
        return 4000;
    }

    @Override
    public int getHealth() {
        return 40;
    }

    @Override
    public int getDefense() {
        return 40;
    }

}
