package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REFINED_MINERAL extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Refined Mineral";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REFINED_MINERAL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 12;
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
        return 2000;
    }

}
