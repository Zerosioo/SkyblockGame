package me.zero.skyblock.items.itemlist.BOW;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOW extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Bow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BOW"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOW;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOW;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 9;
    }

    @Override
    public int getDamage() {
        return 30;
    }

}
