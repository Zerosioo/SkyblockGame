package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EMERALD_BLADE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Emerald Blade";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EMERALD_BLADE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EMERALD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
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
        return 153000;
    }

    @Override
    public int getDamage() {
        return 130;
    }

}
