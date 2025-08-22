package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GIANT_CLEAVER extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Giant Cleaver";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GIANT_CLEAVER"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getGearScore() {
        return 50;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public int getDamage() {
        return 235;
    }

    @Override
    public int getStrength() {
        return 120;
    }

    @Override
    public int getCritDamage() {
        return 120;
    }

}
