package me.zero.skyblock.items.itemlist.WAND;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WAND_OF_HEALING extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Wand of Healing";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WAND_OF_HEALING"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STICK;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.WAND;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

}
