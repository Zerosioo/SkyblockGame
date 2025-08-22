package me.zero.skyblock.items.itemlist.SPADE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IRON_SPADE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Iron Shovel";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "IRON_SPADE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SPADE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SPADE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 2;
    }

    @Override
    public int getDamage() {
        return 25;
    }

}
