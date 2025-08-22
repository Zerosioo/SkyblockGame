package me.zero.skyblock.items.itemlist.PICKAXE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROOKIE_PICKAXE extends SItem implements ItemStatistics, Sellable, Museum {

    @Override
    public String getName() {
        return "Rookie Pickaxe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROOKIE_PICKAXE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_PICKAXE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.PICKAXE;
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
        return 2;
    }

    @Override
    public int getDamage() {
        return 15;
    }

    @Override
    public int getMiningSpeed() {
        return 150;
    }

}
