package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EDIBLE_MACE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Edible Mace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EDIBLE_MACE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MUTTON;
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
        return Gamestage.SKILLED;
    }

    @Override
    public int getDamage() {
        return 125;
    }

    @Override
    public int getStrength() {
        return 25;
    }

}
