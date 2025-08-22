package me.zero.skyblock.items.itemlist.DRILL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TITANIUM_DRILL_3 extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Titanium Drill DR-X555";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TITANIUM_DRILL_3"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PRISMARINE_SHARD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.DRILL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 253000;
    }

    @Override
    public int getDamage() {
        return 75;
    }

    @Override
    public int getMiningFortune() {
        return 70;
    }

    @Override
    public int getMiningSpeed() {
        return 1200;
    }

}
