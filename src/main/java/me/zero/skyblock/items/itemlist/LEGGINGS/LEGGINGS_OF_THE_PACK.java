package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LEGGINGS_OF_THE_PACK extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Leggings of the Pack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LEGGINGS_OF_THE_PACK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_LEGGINGS;
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
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getHealth() {
        return 80;
    }

    @Override
    public int getDefense() {
        return 75;
    }

}
