package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RAGNAROCK_AXE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Ragnarock Axe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RAGNAROCK_AXE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_AXE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public int getDamage() {
        return 200;
    }

    @Override
    public int getStrength() {
        return 70;
    }

}
