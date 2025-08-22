package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GROWTH_BOOTS extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Boots of Growth";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GROWTH_BOOTS"; 
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
        return Rarity.RARE;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(0,190,0);
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
    public int getHealth() {
        return 50;
    }

    @Override
    public int getDefense() {
        return 25;
    }

}
