package me.zero.skyblock.items.itemlist.BOW;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STARRED_BONE_BOOMERANG extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Bonemerang";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STARRED_BONE_BOOMERANG"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BONE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOW;
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getGearScore() {
        return 40;
    }

    @Override
    public int getDamage() {
        return 320;
    }

    @Override
    public int getStrength() {
        return 150;
    }

}
