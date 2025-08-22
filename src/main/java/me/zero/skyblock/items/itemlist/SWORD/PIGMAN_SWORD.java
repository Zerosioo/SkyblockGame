package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PIGMAN_SWORD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Pigman Sword";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PIGMAN_SWORD"; 
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
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getGearScore() {
        return 30;
    }

    @Override
    public int getPrice() {
        return 3100000;
    }

    @Override
    public int getDamage() {
        return 200;
    }

    @Override
    public int getStrength() {
        return 100;
    }

    @Override
    public int getCritChance() {
        return 5;
    }

    @Override
    public int getCritDamage() {
        return 30;
    }

    @Override
    public int getIntelligence() {
        return 300;
    }

}
