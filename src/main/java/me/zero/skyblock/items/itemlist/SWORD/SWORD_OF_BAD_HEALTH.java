package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SWORD_OF_BAD_HEALTH extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Sword of Bad Health";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SWORD_OF_BAD_HEALTH"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getPrice() {
        return 4000;
    }

    @Override
    public int getDamage() {
        return 200;
    }

    @Override
    public int getStrength() {
        return 50;
    }

    @Override
    public int getCritDamage() {
        return 50;
    }

}
