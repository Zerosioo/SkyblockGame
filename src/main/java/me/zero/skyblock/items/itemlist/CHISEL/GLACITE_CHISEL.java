package me.zero.skyblock.items.itemlist.CHISEL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLACITE_CHISEL extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Glacite-Plated Chisel";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GLACITE_CHISEL"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

}
