package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VOIDEDGE_KATANA extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Voidedge Katana";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VOIDEDGE_KATANA"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_SWORD;
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
        return Gamestage.SKILLED;
    }

    @Override
    public int getDamage() {
        return 155;
    }

    @Override
    public int getStrength() {
        return 60;
    }

    @Override
    public int getCritDamage() {
        return 25;
    }

    @Override
    public int getIntelligence() {
        return 50;
    }

}
