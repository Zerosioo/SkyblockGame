package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PLASMA_BUCKET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Plasma Bucket";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PLASMA_BUCKET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LAVA_BUCKET;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.MYTHIC;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public int getPrice() {
        return 50000;
    }

}
