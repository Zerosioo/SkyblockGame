package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RUNIC_STAFF extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Aurora Staff";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RUNIC_STAFF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BLAZE_ROD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
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
        return 46875;
    }

    @Override
    public int getDamage() {
        return 20;
    }

    @Override
    public int getIntelligence() {
        return 250;
    }

}
