package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIVAN_LEGGINGS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Leggings of Divan";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIVAN_LEGGINGS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_LEGGINGS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.LEGGINGS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getHealth() {
        return 130;
    }

    @Override
    public int getDefense() {
        return 170;
    }

    @Override
    public int getMiningFortune() {
        return 30;
    }

    @Override
    public int getMiningSpeed() {
        return 80;
    }

}
