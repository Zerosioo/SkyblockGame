package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DEAD_CAT_DETECTOR extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Cat Detector";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DEAD_CAT_DETECTOR"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RED_ROSE;
    }

    @Override
    public byte getDurability() {
        return 7;
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

}
