package me.zero.skyblock.items.itemlist.SPADE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STONE_SPADE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Stone Shovel";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STONE_SPADE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_SPADE;
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
        return 1;
    }

    @Override
    public int getDamage() {
        return 20;
    }

}
