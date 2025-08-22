package me.zero.skyblock.items.itemlist.WAND;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BINGO_BLASTER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Bingo Blaster";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BINGO_BLASTER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_BARDING;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.WAND;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public int getIntelligence() {
        return 300;
    }

    @Override
    public double getAbilityDamage() {
        return 20.0;
    }

}
