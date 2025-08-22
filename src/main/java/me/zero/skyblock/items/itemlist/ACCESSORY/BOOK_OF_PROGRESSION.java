package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOOK_OF_PROGRESSION extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Book of Progression";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BOOK_OF_PROGRESSION"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOOK;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

}
