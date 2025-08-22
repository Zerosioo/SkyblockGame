package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILK_EDGE_SWORD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Silk-Edge Sword";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SILK_EDGE_SWORD"; 
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
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getPrice() {
        return 375000;
    }

    @Override
    public int getDamage() {
        return 175;
    }

    @Override
    public int getStrength() {
        return 125;
    }

    @Override
    public int getCritDamage() {
        return 25;
    }

}
