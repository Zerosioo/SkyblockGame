package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EMERALD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Emerald";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EMERALD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EMERALD;
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
        return 4;
    }

}
