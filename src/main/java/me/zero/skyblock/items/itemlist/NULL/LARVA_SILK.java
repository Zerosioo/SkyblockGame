package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LARVA_SILK extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Larva Silk";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LARVA_SILK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STRING;
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
    public boolean isEnchanted() {
        return true;
    }

}
