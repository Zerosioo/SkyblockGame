package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WOOL_14 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Red Wool";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WOOL:14"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOL;
    }

    @Override
    public byte getDurability() {
        return 14;
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
