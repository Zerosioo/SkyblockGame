package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FALLEN_STAR_TRACKER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Fallen Star Lozenge";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FALLEN_STAR_TRACKER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND;
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

}
