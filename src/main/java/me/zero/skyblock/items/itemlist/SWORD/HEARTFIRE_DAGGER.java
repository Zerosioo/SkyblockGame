package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HEARTFIRE_DAGGER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Pyrochaos Dagger";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HEARTFIRE_DAGGER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_SWORD;
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
    public Gamestage getGamestage() {
        return Gamestage.MASTER;
    }

    @Override
    public int getDamage() {
        return 160;
    }

    @Override
    public int getStrength() {
        return 75;
    }

    @Override
    public int getCritChance() {
        return 10;
    }

    @Override
    public int getCritDamage() {
        return 25;
    }

    @Override
    public int getAttackSpeed() {
        return 20;
    }

}
