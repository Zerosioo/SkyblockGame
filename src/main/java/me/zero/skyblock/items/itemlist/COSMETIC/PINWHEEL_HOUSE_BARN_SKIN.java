package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PINWHEEL_HOUSE_BARN_SKIN extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Pinwheel House Barn Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PINWHEEL_HOUSE_BARN_SKIN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

}
