package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WINTER_BARN_BARN_SKIN extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Winter Barn Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WINTER_BARN_BARN_SKIN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SNOW_BLOCK;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

}
