package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLD_BOOTS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Golden Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLD_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_BOOTS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOOTS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 8;
    }

    @Override
    public int getDefense() {
        return 5;
    }

}
