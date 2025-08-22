package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MEDIUM_ENCHANTED_CHEST extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Medium Storage";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MEDIUM_ENCHANTED_CHEST"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHEST;
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
        return 1200;
    }

}
