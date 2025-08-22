package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VOID_SWORD extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Void Sword";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VOID_SWORD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_SWORD;
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
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
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
        return 125;
    }

}
