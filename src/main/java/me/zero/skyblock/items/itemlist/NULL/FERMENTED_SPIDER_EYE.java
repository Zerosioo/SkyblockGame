package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FERMENTED_SPIDER_EYE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Fermented Spider Eye";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FERMENTED_SPIDER_EYE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FERMENTED_SPIDER_EYE;
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
    public int getPrice() {
        return 10;
    }

}
