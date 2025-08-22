package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAME_BREAKER_LEGGINGS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Flamebreaker Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAME_BREAKER_LEGGINGS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHAINMAIL_LEGGINGS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.LEGGINGS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getHealth() {
        return 60;
    }

    @Override
    public int getDefense() {
        return 60;
    }

    @Override
    public int getMiningFortune() {
        return 15;
    }

    @Override
    public int getMiningSpeed() {
        return 25;
    }

}
