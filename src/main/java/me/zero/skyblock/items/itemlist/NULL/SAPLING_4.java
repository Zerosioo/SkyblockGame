package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SAPLING_4 extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Acacia Sapling";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SAPLING:4"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SAPLING;
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

}
