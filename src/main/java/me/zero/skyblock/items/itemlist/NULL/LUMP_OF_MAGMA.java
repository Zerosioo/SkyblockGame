package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LUMP_OF_MAGMA extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Lump of Magma";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oSelf","§7§oexplanatory.")); 
    }

    @Override
    public String getId() {
        return "LUMP_OF_MAGMA"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FIREBALL;
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
