package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PERFECT_BOOTS_3 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Perfect Boots - Tier III";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PERFECT_BOOTS_3"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_BOOTS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOOTS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getPrice() {
        return 1228800;
    }

    @Override
    public int getDefense() {
        return 130;
    }

}
