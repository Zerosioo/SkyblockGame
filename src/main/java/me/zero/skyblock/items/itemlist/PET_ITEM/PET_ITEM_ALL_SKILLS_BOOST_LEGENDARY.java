package me.zero.skyblock.items.itemlist.PET_ITEM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_ITEM_ALL_SKILLS_BOOST_LEGENDARY extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "All Skills Exp Boost";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_ITEM_ALL_SKILLS_BOOST_LEGENDARY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.PET_ITEM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

}
