package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RANDOM_FIREWORK extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Random Firework";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RANDOM_FIREWORK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FIREWORK;
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
        return 5200;
    }

}
