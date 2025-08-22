package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CROWN_OF_GREED extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Crown of Greed";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CROWN_OF_GREED"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_HELMET;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 1000000;
    }

    @Override
    public int getHealth() {
        return 130;
    }

    @Override
    public int getDefense() {
        return 90;
    }

    @Override
    public int getMagicFind() {
        return 4;
    }

}
