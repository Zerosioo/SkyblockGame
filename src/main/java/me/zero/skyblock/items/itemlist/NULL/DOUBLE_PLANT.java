package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DOUBLE_PLANT extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Sunflower";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DOUBLE_PLANT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DOUBLE_PLANT;
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
