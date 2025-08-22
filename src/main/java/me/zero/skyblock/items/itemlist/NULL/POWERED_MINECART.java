package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POWERED_MINECART extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Minecart with Furnace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POWERED_MINECART"; 
    }

    @Override
    public Material getMaterial() {
        return Material.POWERED_MINECART;
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
        return 12;
    }

}
