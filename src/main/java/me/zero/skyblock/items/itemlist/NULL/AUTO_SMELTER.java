package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AUTO_SMELTER extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Auto Smelter";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "AUTO_SMELTER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FURNACE;
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
        return 32;
    }

}
