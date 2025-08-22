package me.zero.skyblock.items.itemlist.SHEARS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MOBYS_SHEARS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Moby's Shears";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MOBYS_SHEARS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SHEARS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SHEARS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
