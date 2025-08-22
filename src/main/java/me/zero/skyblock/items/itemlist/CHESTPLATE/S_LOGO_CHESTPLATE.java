package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S_LOGO_CHESTPLATE extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "W Logo";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "S_LOGO_CHESTPLATE"; 
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
        return Rarity.MYTHIC;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(255,215,0);
    }

    @Override
    public int getRiftManaRegeneration() {
        return 30;
    }

}
