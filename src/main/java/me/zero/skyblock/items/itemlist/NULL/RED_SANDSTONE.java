package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_SANDSTONE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Red Sandstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RED_SANDSTONE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RED_SANDSTONE;
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
        return 3;
    }

}
