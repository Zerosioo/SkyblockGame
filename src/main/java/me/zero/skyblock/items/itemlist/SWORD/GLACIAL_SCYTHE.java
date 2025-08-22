package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLACIAL_SCYTHE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Glacial Scythe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GLACIAL_SCYTHE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_HOE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
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
    public int getPrice() {
        return 500;
    }

    @Override
    public int getDamage() {
        return 120;
    }

    @Override
    public int getIntelligence() {
        return 30;
    }

}
