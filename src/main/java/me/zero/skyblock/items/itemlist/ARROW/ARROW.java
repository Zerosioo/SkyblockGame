package me.zero.skyblock.items.itemlist.ARROW;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARROW extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Flint Arrow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARROW"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ARROW;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.ARROW;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 2;
    }

    @Override
    public int getDamage() {
        return 1;
    }

}
