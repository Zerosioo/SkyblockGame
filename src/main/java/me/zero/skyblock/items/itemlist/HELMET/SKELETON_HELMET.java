package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SKELETON_HELMET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Skeleton's Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SKELETON_HELMET"; 
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
        return Gamestage.SKILLED;
    }

    @Override
    public int getPrice() {
        return 51000;
    }

    @Override
    public int getDefense() {
        return 75;
    }

}
