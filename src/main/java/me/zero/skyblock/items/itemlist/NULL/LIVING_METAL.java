package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIVING_METAL extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Living Metal";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("It snakes around","your blocky hand as","you hold it.")); 
    }

    @Override
    public String getId() {
        return "LIVING_METAL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STAINED_GLASS;
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
        return Rarity.RARE;
    }

}
