package me.zero.skyblock.items.itemlist.DEPLOYABLE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WARNING_FLARE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Warning Flare";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WARNING_FLARE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FIREWORK;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.DEPLOYABLE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

}
