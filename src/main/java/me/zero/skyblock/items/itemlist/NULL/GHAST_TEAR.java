package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GHAST_TEAR extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Ghast Tear";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GHAST_TEAR"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GHAST_TEAR;
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
        return 16;
    }

}
