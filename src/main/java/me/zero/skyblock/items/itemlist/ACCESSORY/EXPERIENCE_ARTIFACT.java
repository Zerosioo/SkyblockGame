package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EXPERIENCE_ARTIFACT extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Experience Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EXPERIENCE_ARTIFACT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ENCHANTED_BOOK;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 115000;
    }

}
