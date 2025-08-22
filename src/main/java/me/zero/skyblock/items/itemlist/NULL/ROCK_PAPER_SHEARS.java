package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROCK_PAPER_SHEARS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Rock Paper Shears";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROCK_PAPER_SHEARS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SHEARS;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

}
