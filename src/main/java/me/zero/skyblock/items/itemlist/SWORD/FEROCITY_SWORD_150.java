package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FEROCITY_SWORD_150 extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Ferocity Sword 150";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FEROCITY_SWORD_150"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_SWORD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNOBTAINABLE;
    }

    @Override
    public int getDamage() {
        return 10;
    }

}
