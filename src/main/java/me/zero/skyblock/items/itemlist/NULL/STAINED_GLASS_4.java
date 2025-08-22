package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STAINED_GLASS_4 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Yellow Stained Glass";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STAINED_GLASS:4"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STAINED_GLASS;
    }

    @Override
    public byte getDurability() {
        return 4;
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
        return 3;
    }

}
