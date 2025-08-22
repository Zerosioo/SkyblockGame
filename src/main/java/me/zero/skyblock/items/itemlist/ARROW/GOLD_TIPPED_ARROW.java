package me.zero.skyblock.items.itemlist.ARROW;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLD_TIPPED_ARROW extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Gold-tipped Arrow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLD_TIPPED_ARROW"; 
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
        return 1;
    }

    @Override
    public int getDamage() {
        return 10;
    }

}
