package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SHADOW_FURY extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Shadow Fury";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SHADOW_FURY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_SWORD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getGearScore() {
        return 100;
    }

    @Override
    public int getPrice() {
        return 500000;
    }

    @Override
    public int getDamage() {
        return 300;
    }

    @Override
    public int getStrength() {
        return 130;
    }

    @Override
    public int getCritDamage() {
        return 30;
    }

    @Override
    public int getSpeed() {
        return 30;
    }

}
