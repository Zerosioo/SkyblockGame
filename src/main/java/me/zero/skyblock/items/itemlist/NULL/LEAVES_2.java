package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LEAVES_2 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Birch Leaves";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LEAVES:2"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEAVES;
    }

    @Override
    public byte getDurability() {
        return 2;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
