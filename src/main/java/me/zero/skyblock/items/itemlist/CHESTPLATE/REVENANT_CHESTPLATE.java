package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REVENANT_CHESTPLATE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Revenant Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REVENANT_CHESTPLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_CHESTPLATE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.CHESTPLATE;
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
        return 180;
    }

    @Override
    public int getDefense() {
        return 70;
    }

}
