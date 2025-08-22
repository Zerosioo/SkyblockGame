package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPONGE_HELMET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Sponge Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPONGE_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SPONGE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
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
    public int getPrice() {
        return 40000;
    }

    @Override
    public int getSeaCreatureChance() {
        return 2;
    }

}
