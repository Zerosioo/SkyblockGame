package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUPER_CLEAVER extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Super Cleaver";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SUPER_CLEAVER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_SWORD;
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public int getDamage() {
        return 105;
    }

    @Override
    public int getStrength() {
        return 20;
    }

    @Override
    public int getCritDamage() {
        return 20;
    }

}
