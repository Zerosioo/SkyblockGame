package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DEAD_BUSH_OF_LOVE extends SItem implements ItemStatistics, Sellable, Museum {

    @Override
    public String getName() {
        return "Dead Bush of Love";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DEAD_BUSH_OF_LOVE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DEAD_BUSH;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 333;
    }

}
