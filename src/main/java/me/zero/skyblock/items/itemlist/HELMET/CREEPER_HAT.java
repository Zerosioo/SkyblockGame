package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CREEPER_HAT extends SItem implements ItemStatistics, Sellable, Museum {

    @Override
    public String getName() {
        return "Creeper Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CREEPER_HAT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SKULL_ITEM;
    }

    @Override
    public byte getDurability() {
        return 4;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.STARTER;
    }

    @Override
    public int getPrice() {
        return 16;
    }

    @Override
    public int getStrength() {
        return 5;
    }

    @Override
    public int getCritChance() {
        return 5;
    }

    @Override
    public int getCritDamage() {
        return 5;
    }

    @Override
    public int getHealth() {
        return 5;
    }

    @Override
    public int getDefense() {
        return 5;
    }

    @Override
    public int getIntelligence() {
        return 5;
    }

}
