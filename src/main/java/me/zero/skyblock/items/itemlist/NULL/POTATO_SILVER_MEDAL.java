package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POTATO_SILVER_MEDAL extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Potato War Silver Medal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POTATO_SILVER_MEDAL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_INGOT;
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
    public boolean isMuseum() {
        return true;
    }

}
