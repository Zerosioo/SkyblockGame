package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IRON_BOOTS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Iron Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "IRON_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_BOOTS;
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
        return 6;
    }

    @Override
    public int getDefense() {
        return 10;
    }

}
