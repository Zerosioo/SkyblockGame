package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SQUIRE_HELMET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Squire Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SQUIRE_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHAINMAIL_HELMET;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
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
        return 2500;
    }

    @Override
    public int getHealth() {
        return 25;
    }

    @Override
    public int getDefense() {
        return 25;
    }

}
