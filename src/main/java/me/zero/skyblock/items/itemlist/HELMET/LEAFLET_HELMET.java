package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LEAFLET_HELMET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Leaflet Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LEAFLET_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEAVES;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.STARTER;
    }

    @Override
    public int getPrice() {
        return 2;
    }

    @Override
    public int getHealth() {
        return 20;
    }

}
