package me.zero.skyblock.items.itemlist.LONGSWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STARRED_FELTHORN_REAPER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Felthorn Reaper";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STARRED_FELTHORN_REAPER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.LONGSWORD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
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
    public int getDamage() {
        return 285;
    }

    @Override
    public int getStrength() {
        return 10;
    }

    @Override
    public int getCritDamage() {
        return 125;
    }

    @Override
    public int getSwingRange() {
        return 1;
    }

}
