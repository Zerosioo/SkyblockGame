package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BACKWATER_BOOTS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Backwater Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BACKWATER_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_BOOTS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOOTS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(1,125,49);
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getSeaCreatureChance() {
        return 1;
    }

}
