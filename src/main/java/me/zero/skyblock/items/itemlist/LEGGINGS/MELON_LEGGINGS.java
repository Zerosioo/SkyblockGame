package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MELON_LEGGINGS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Melon Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MELON_LEGGINGS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_LEGGINGS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.LEGGINGS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(137,158,32);
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getFarmingFortune() {
        return 20;
    }

}
