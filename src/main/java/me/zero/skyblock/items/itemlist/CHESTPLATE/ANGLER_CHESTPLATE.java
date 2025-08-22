package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANGLER_CHESTPLATE extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Angler Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ANGLER_CHESTPLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_CHESTPLATE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.CHESTPLATE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(11,0,79);
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public int getPrice() {
        return 24;
    }

    @Override
    public int getSeaCreatureChance() {
        return 1;
    }

}
