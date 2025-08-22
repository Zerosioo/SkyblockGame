package me.zero.skyblock.items.itemlist.BOOTS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REKINDLED_EMBER_BOOTS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Rekindled Ember Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REKINDLED_EMBER_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHAINMAIL_BOOTS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.BOOTS;
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
        return 40000;
    }

    @Override
    public int getStrength() {
        return 30;
    }

    @Override
    public int getCritDamage() {
        return 15;
    }

    @Override
    public int getHealth() {
        return 140;
    }

    @Override
    public int getDefense() {
        return 40;
    }

    @Override
    public int getIntelligence() {
        return 5;
    }

}
