package me.zero.skyblock.items.itemlist.BOW;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DRAGON_SHORTBOW extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Dragon Shortbow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DRAGON_SHORTBOW"; 
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
        return 120;
    }

    @Override
    public int getStrength() {
        return 40;
    }

    @Override
    public int getCritChance() {
        return 15;
    }

    @Override
    public int getCritDamage() {
        return 50;
    }

}
