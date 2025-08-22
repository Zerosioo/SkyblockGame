package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QUARTZ_ORE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Nether Quartz Ore";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "QUARTZ_ORE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.QUARTZ_ORE;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 6;
    }

}
