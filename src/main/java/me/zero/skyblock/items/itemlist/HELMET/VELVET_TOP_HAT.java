package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VELVET_TOP_HAT extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Velvet Top Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VELVET_TOP_HAT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_HELMET;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

}
