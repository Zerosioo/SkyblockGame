package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SELF_RECURSIVE_PICKAXE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Self-Recursive Pickaxe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SELF_RECURSIVE_PICKAXE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_PICKAXE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
