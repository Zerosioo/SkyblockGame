package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_ROSE_8 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Oxeye Daisy";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RED_ROSE:8"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RED_ROSE;
    }

    @Override
    public byte getDurability() {
        return 8;
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
        return 1;
    }

}
