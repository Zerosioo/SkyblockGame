package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SEWER_FISH extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Sewer Fish";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Where did you find","these? They stink!")); 
    }

    @Override
    public String getId() {
        return "SEWER_FISH"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RAW_FISH;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
