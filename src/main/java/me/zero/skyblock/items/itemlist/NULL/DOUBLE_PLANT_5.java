package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DOUBLE_PLANT_5 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Peony";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DOUBLE_PLANT:5"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DOUBLE_PLANT;
    }

    @Override
    public byte getDurability() {
        return 5;
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
        return 1;
    }

}
