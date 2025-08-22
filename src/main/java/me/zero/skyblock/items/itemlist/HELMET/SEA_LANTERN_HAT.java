package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SEA_LANTERN_HAT extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Sea Lantern Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SEA_LANTERN_HAT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SEA_LANTERN;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

}
