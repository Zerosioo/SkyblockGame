package me.zero.skyblock.items.itemlist.LONGSWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GIANTS_EYE_SWORD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Giant's Eye Sword";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GIANTS_EYE_SWORD"; 
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
        return DungeonType.MASTER_CATACOMBS;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public int getDamage() {
        return 500;
    }

    @Override
    public int getSwingRange() {
        return 1;
    }

}
