package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROSE_BOUQUET extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "§cRose Bouquet";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oA hastily-made","§7§obouquet","§7§oconsisting of","§7§oMarco's finest","§7§oroses.")); 
    }

    @Override
    public String getId() {
        return "ROSE_BOUQUET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DOUBLE_PLANT;
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
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

}
