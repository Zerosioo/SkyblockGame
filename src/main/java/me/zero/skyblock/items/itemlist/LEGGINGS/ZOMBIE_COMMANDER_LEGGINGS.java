package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZOMBIE_COMMANDER_LEGGINGS extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Zombie Commander Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ZOMBIE_COMMANDER_LEGGINGS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_LEGGINGS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.LEGGINGS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(213,18,48);
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
    public int getPrice() {
        return 1;
    }

}
