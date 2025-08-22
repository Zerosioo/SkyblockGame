package me.zero.skyblock.items.itemlist.FISHING_ROD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ICE_ROD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Ice Rod";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ICE_ROD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FISHING_ROD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.FISHING_ROD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 20000;
    }

    @Override
    public int getFishingSpeed() {
        return 15;
    }

}
