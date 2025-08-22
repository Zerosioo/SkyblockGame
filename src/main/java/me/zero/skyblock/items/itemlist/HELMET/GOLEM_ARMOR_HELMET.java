package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLEM_ARMOR_HELMET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Golem Armor Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLEM_ARMOR_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_HELMET;
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
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 12000;
    }

    @Override
    public int getHealth() {
        return 45;
    }

    @Override
    public int getDefense() {
        return 45;
    }

}
