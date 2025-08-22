package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RABBIT_CHESTPLATE extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Rabbit Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RABBIT_CHESTPLATE"; 
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
        return Color.fromRGB(203,210,219);
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getFarmingFortune() {
        return 15;
    }

}
