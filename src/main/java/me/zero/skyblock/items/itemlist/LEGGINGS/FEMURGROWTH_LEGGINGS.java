package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FEMURGROWTH_LEGGINGS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Femurgrowth Leggings";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8It's infected","§8slime, it makes","§8you slower.")); 
    }

    @Override
    public String getId() {
        return "FEMURGROWTH_LEGGINGS"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(72,255,0);
    }

    @Override
    public int getRiftManaRegeneration() {
        return 5;
    }

}
