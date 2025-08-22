package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SORROW_CHESTPLATE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Sorrow Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SORROW_CHESTPLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHAINMAIL_CHESTPLATE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.CHESTPLATE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 120000;
    }

    @Override
    public int getTrueDefense() {
        return 80;
    }

    @Override
    public int getMagicFind() {
        return 5;
    }

    @Override
    public int getMiningFortune() {
        return 20;
    }

    @Override
    public int getMiningSpeed() {
        return 50;
    }

}
