package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOOK_OF_STATS extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Book of Stats";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BOOK_OF_STATS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOOK;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

}
