package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PERFECT_CHESTPLATE_10 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Perfect Chestplate - Tier X";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PERFECT_CHESTPLATE_10"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_CHESTPLATE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.CHESTPLATE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getPrice() {
        return 4505600;
    }

    @Override
    public int getDefense() {
        return 340;
    }

}
