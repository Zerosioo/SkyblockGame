package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NEW_BOTTLE_OF_JYRRE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "§cBottle of Jyrre";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "NEW_BOTTLE_OF_JYRRE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.POTION;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

}
