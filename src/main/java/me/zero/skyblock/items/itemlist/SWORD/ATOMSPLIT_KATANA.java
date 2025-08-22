package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ATOMSPLIT_KATANA extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Atomsplit Katana";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ATOMSPLIT_KATANA"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_SWORD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.PROFESSIONAL;
    }

    @Override
    public int getDamage() {
        return 305;
    }

    @Override
    public int getStrength() {
        return 100;
    }

    @Override
    public int getCritDamage() {
        return 50;
    }

    @Override
    public int getIntelligence() {
        return 300;
    }

}
