package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SWORD_OF_REVELATIONS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Sword of Revelations";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SWORD_OF_REVELATIONS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOD_SWORD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
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
    public int getDamage() {
        return 180;
    }

    @Override
    public int getStrength() {
        return 50;
    }

}
