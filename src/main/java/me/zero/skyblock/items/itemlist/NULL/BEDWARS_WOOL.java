package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BEDWARS_WOOL extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Tree-like Wool";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Good for bridging.")); 
    }

    @Override
    public String getId() {
        return "BEDWARS_WOOL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOL;
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
        return Rarity.COMMON;
    }

}
