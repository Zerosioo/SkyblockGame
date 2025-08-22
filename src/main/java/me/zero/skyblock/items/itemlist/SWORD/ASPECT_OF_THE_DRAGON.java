package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ASPECT_OF_THE_DRAGON extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Aspect of the Dragons";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ASPECT_OF_THE_DRAGON"; 
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
        return Rarity.LEGENDARY;
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
    public int getPrice() {
        return 100000;
    }

    @Override
    public int getDamage() {
        return 225;
    }

    @Override
    public int getStrength() {
        return 100;
    }

}
