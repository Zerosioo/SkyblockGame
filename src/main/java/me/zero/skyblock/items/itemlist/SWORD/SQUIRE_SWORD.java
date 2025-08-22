package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SQUIRE_SWORD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Squire Sword";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SQUIRE_SWORD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
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
        return 2500;
    }

    @Override
    public int getDamage() {
        return 50;
    }

    @Override
    public int getStrength() {
        return 10;
    }

}
