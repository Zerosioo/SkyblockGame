package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NULLIFIED_METAL extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Nullified Metal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "NULLIFIED_METAL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CARPET;
    }

    @Override
    public byte getDurability() {
        return 11;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

}
