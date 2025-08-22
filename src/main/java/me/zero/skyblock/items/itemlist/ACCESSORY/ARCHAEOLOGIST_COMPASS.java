package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARCHAEOLOGIST_COMPASS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Archaeologist's Compass";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARCHAEOLOGIST_COMPASS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COMPASS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

}
