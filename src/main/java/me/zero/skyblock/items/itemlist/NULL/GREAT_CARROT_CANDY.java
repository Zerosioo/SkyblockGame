package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GREAT_CARROT_CANDY extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Great Carrot Candy";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GREAT_CARROT_CANDY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CARROT;
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
