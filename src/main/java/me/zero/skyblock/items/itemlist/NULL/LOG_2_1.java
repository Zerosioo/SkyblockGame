package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LOG_2_1 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Dark Oak Wood";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LOG_2:1"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LOG_2;
    }

    @Override
    public byte getDurability() {
        return 1;
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
