package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PERFECT_LEGGINGS_11 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Perfect Leggings - Tier XI";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PERFECT_LEGGINGS_11"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_LEGGINGS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.LEGGINGS;
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
        return 4812800;
    }

    @Override
    public int getDefense() {
        return 340;
    }

}
