package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SINSEEKER_SCYTHE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "§4Sin§5seeker Scythe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SINSEEKER_SCYTHE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_HOE;
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
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getDamage() {
        return 100;
    }

    @Override
    public int getStrength() {
        return 100;
    }

}
