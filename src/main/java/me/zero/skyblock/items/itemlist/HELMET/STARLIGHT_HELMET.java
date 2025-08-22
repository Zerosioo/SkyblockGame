package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STARLIGHT_HELMET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Starlight Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STARLIGHT_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_HELMET;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public int getPrice() {
        return 17500;
    }

    @Override
    public int getHealth() {
        return 30;
    }

    @Override
    public int getDefense() {
        return 30;
    }

    @Override
    public int getIntelligence() {
        return 50;
    }

}
