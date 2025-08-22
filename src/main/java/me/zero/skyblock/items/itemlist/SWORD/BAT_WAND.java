package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BAT_WAND extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Spirit Sceptre";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BAT_WAND"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RED_ROSE;
    }

    @Override
    public byte getDurability() {
        return 2;
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
        return 40;
    }

    @Override
    public int getDamage() {
        return 180;
    }

    @Override
    public int getIntelligence() {
        return 300;
    }

}
