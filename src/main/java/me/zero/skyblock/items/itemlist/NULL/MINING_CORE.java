package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MINING_CORE extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Mining Core";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MINING_CORE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FIREWORK_CHARGE;
    }

    @Override
    public ItemType getItemType() {
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(255,0,0);
    }

}
