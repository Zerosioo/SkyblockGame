package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PARTY_HAT extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Party Top Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PARTY_HAT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_HELMET;
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
    public Color getColor() {
        return Color.fromRGB(0,255,0);
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

}
