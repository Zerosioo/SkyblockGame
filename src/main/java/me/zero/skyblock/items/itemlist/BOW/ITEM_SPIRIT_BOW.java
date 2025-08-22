package me.zero.skyblock.items.itemlist.BOW;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ITEM_SPIRIT_BOW extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Spirit Shortbow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ITEM_SPIRIT_BOW"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOW;
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
        return 210;
    }

    @Override
    public int getStrength() {
        return 100;
    }

}
