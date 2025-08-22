package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class THE_ART_OF_WAR extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "The Art of War";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "THE_ART_OF_WAR"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOOK;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

}
