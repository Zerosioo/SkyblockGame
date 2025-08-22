package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JASPER_POWER_SCROLL extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Jasper Power Scroll";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JASPER_POWER_SCROLL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOOK_AND_QUILL;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

}
