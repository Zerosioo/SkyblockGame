package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAPIS_ARMOR_HELMET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Lapis Armor Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LAPIS_ARMOR_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SEA_LANTERN;
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
        return Gamestage.AMATEUR;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public int getDefense() {
        return 25;
    }

    @Override
    public int getMiningFortune() {
        return 2;
    }

    @Override
    public int getMiningSpeed() {
        return 20;
    }

}
