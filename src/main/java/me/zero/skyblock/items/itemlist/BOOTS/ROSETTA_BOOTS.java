package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROSETTA_BOOTS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Rosetta's Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROSETTA_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_BOOTS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOOTS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.STARTER;
    }

    @Override
    public int getPrice() {
        return 480;
    }

    @Override
    public int getDefense() {
        return 20;
    }

}
