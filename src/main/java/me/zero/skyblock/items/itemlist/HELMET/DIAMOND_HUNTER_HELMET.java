package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_HUNTER_HELMET extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Diamond Hunter Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_HUNTER_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_HELMET;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.MASTER;
    }

}
