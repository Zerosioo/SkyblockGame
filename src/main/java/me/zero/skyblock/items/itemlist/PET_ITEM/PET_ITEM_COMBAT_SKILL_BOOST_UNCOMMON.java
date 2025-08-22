package me.zero.skyblock.items.itemlist.PET_ITEM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_ITEM_COMBAT_SKILL_BOOST_UNCOMMON extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Combat Exp Boost";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_ITEM_COMBAT_SKILL_BOOST_UNCOMMON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.PET_ITEM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

}
