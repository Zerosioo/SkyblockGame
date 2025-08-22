package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DARK_QUEENS_SOUL_DROP extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Dark Queen's Soul";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DARK_QUEENS_SOUL_DROP"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CLAY_BALL;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

}
