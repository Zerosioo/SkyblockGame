package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURNED_PANTS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Burned Pants";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8Maybe encouraging","§8him wasn't a great","§8idea.")); 
    }

    @Override
    public String getId() {
        return "BURNED_PANTS"; 
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
        return Rarity.RARE;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(12,12,150);
    }

}
