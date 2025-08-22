package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPIDER_BOOTS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Spider's Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPIDER_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_BOOTS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOOTS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
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
    public int getPrice() {
        return 74000;
    }

    @Override
    public int getDefense() {
        return 45;
    }

    @Override
    public int getIntelligence() {
        return 50;
    }

    @Override
    public int getSpeed() {
        return 5;
    }

}
