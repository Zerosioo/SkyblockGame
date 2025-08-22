package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIRE_FREEZE_STAFF extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Fire Freeze Staff";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FIRE_FREEZE_STAFF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.YELLOW_FLOWER;
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
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 1750;
    }

    @Override
    public int getDamage() {
        return 50;
    }

    @Override
    public int getStrength() {
        return 20;
    }

}
