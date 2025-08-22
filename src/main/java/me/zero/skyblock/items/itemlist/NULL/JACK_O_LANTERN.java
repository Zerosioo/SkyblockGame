package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JACK_O_LANTERN extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Jack o' Lantern";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JACK_O_LANTERN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.JACK_O_LANTERN;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 4;
    }

}
