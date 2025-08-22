package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHICKEN_LEGGS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Chicken Leggs";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8Sometimes you","§8pretend to be a","§8dolphin, sometimes","§8a chicken. Cluck","§8cluck!")); 
    }

    @Override
    public String getId() {
        return "CHICKEN_LEGGS"; 
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
        return Color.fromRGB(255,242,0);
    }

}
