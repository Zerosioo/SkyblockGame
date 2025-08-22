package me.zero.skyblock.items.itemlist.CHISEL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHISEL extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Chisel";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHISEL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ARMOR_STAND;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.CHISEL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

}
