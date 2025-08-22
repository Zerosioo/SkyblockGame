package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIVID_DAGGER extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Livid Dagger";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LIVID_DAGGER"; 
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
        return Gamestage.SKILLED;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getGearScore() {
        return 75;
    }

    @Override
    public int getPrice() {
        return 500000;
    }

    @Override
    public int getDamage() {
        return 210;
    }

    @Override
    public int getStrength() {
        return 60;
    }

    @Override
    public int getCritChance() {
        return 100;
    }

    @Override
    public int getCritDamage() {
        return 50;
    }

    @Override
    public int getAttackSpeed() {
        return 50;
    }

}
