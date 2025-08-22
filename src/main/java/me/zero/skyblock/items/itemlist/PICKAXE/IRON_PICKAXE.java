package me.zero.skyblock.items.itemlist.PICKAXE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IRON_PICKAXE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Iron Pickaxe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "IRON_PICKAXE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_PICKAXE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.PICKAXE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 4;
    }

    @Override
    public int getDamage() {
        return 25;
    }

    @Override
    public int getMiningSpeed() {
        return 160;
    }

}
