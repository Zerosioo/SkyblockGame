package me.zero.skyblock.items.itemlist.TRAVEL_SCROLL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DANGER_3_TRAVEL_SCROLL extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Travel Scroll to the End";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DANGER_3_TRAVEL_SCROLL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EMPTY_MAP;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.TRAVEL_SCROLL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 100;
    }

}
