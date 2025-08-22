package me.zero.skyblock.items.itemlist.PICKAXE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_PICKAXE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Diamond Pickaxe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_PICKAXE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_PICKAXE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.PICKAXE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 12;
    }

    @Override
    public int getDamage() {
        return 30;
    }

    @Override
    public int getMiningSpeed() {
        return 220;
    }

}
