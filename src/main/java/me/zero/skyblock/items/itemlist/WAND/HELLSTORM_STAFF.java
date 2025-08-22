package me.zero.skyblock.items.itemlist.WAND;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HELLSTORM_STAFF extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Hellstorm Wand";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HELLSTORM_STAFF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.REDSTONE_TORCH_ON;
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
    public int getPrice() {
        return 100000;
    }

    @Override
    public int getDamage() {
        return 120;
    }

    @Override
    public int getStrength() {
        return 50;
    }

    @Override
    public int getIntelligence() {
        return 100;
    }

}
