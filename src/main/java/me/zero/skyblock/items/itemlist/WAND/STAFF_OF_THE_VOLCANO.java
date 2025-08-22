package me.zero.skyblock.items.itemlist.WAND;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STAFF_OF_THE_VOLCANO extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Staff of the Volcano";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STAFF_OF_THE_VOLCANO"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WHEAT;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.WAND;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public int getDamage() {
        return 60;
    }

    @Override
    public int getIntelligence() {
        return 150;
    }

}
