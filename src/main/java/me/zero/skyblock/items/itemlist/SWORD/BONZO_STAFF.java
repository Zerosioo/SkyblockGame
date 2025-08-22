package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BONZO_STAFF extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Bonzo's Staff";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BONZO_STAFF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BLAZE_ROD;
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
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getDamage() {
        return 160;
    }

    @Override
    public int getIntelligence() {
        return 250;
    }

}
