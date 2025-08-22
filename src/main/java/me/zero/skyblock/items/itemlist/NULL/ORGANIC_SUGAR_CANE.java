package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ORGANIC_SUGAR_CANE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Organic Sugar Cane";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ORGANIC_SUGAR_CANE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SUGAR_CANE;
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
        return 2;
    }

}
