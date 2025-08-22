package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MOOGMA_PELT extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Moogma Pelt";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oThe bottom of","§7§othe volcano is","§7§ofilled with it,","§7§oMoogmas keep on","§7§omoulting. It's a","§7§oproblem.")); 
    }

    @Override
    public String getId() {
        return "MOOGMA_PELT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER;
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 50;
    }

}
