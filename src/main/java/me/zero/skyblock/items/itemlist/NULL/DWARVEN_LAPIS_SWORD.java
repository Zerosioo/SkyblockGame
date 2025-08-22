package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DWARVEN_LAPIS_SWORD extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Scavenged Lapis Sword";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DWARVEN_LAPIS_SWORD"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

}
