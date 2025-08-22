package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ETERNAL_CRYSTAL extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Eternal Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ETERNAL_CRYSTAL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.NETHER_STAR;
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
        return 105000;
    }

}
