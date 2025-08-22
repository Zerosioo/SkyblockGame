package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLINT_AND_STEEL extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Flint and Steel";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLINT_AND_STEEL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FLINT_AND_STEEL;
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
        return 7;
    }

}
