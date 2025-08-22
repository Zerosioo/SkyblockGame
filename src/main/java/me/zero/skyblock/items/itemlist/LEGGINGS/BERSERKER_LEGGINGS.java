package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BERSERKER_LEGGINGS extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Berserker Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BERSERKER_LEGGINGS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_LEGGINGS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.LEGGINGS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(255,183,39);
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getPrice() {
        return 258250;
    }

    @Override
    public int getStrength() {
        return 50;
    }

    @Override
    public int getCritDamage() {
        return 50;
    }

}
