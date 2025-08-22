package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FARM_ARMOR_BOOTS extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Farm Armor Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FARM_ARMOR_BOOTS"; 
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
        return Color.fromRGB(255,215,0);
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public int getPrice() {
        return 2500;
    }

    @Override
    public int getHealth() {
        return 20;
    }

    @Override
    public int getDefense() {
        return 35;
    }

    @Override
    public int getFarmingFortune() {
        return 10;
    }

}
