package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIREDUST_DAGGER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Firedust Dagger";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FIREDUST_DAGGER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_SWORD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getDamage() {
        return 90;
    }

    @Override
    public int getStrength() {
        return 45;
    }

    @Override
    public int getCritDamage() {
        return 15;
    }

}
