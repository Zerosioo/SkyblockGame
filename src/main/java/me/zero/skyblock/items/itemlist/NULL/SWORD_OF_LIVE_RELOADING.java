package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SWORD_OF_LIVE_RELOADING extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Sword of Live Reloading";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SWORD_OF_LIVE_RELOADING"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_SWORD;
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
    public int getDamage() {
        return 69;
    }

    @Override
    public int getFerocity() {
        return 600;
    }

}
