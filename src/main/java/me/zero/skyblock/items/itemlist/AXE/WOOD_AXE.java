package me.zero.skyblock.items.itemlist.AXE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WOOD_AXE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Wooden Axe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WOOD_AXE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOD_AXE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.AXE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public int getDamage() {
        return 10;
    }

}
