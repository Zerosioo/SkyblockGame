package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TALBOTS_THEODOLITE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Talbot's Theodolite";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TALBOTS_THEODOLITE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIODE;
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public int getPrice() {
        return 10;
    }

}
