package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PERFECT_HELMET_13 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Perfect Helmet - Tier XIII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PERFECT_HELMET_13"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_HELMET;
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
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getPrice() {
        return 5017600;
    }

    @Override
    public int getDefense() {
        return 350;
    }

}
