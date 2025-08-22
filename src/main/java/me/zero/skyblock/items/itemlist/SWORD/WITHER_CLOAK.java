package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WITHER_CLOAK extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Wither Cloak Sword";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WITHER_CLOAK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_SWORD;
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
        return Gamestage.EXPERT;
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
        return 1000;
    }

    @Override
    public int getDamage() {
        return 190;
    }

    @Override
    public int getStrength() {
        return 135;
    }

    @Override
    public int getDefense() {
        return 250;
    }

}
