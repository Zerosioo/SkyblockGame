package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FANCY_SWORD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Fancy Sword";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FANCY_SWORD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_SWORD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.STARTER;
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public int getDamage() {
        return 20;
    }

}
