package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COLOSSAL_EXP_BOTTLE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Colossal Experience Bottle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COLOSSAL_EXP_BOTTLE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EXP_BOTTLE;
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

}
