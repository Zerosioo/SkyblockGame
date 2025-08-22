package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLADE_OF_THE_VOLCANO extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Blade of the Volcano";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLADE_OF_THE_VOLCANO"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public int getDamage() {
        return 220;
    }

    @Override
    public int getStrength() {
        return 70;
    }

    @Override
    public int getCritDamage() {
        return 20;
    }

}
