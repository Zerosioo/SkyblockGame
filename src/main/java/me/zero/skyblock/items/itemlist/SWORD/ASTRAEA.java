package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ASTRAEA extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Astraea";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ASTRAEA"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.MASTER;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getDamage() {
        return 270;
    }

    @Override
    public int getStrength() {
        return 150;
    }

    @Override
    public int getDefense() {
        return 250;
    }

    @Override
    public int getTrueDefense() {
        return 20;
    }

    @Override
    public int getIntelligence() {
        return 50;
    }

}
