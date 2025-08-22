package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RAIDER_AXE extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Raider Axe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RAIDER_AXE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_AXE;
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
        return Gamestage.AMATEUR;
    }

    @Override
    public int getDamage() {
        return 80;
    }

    @Override
    public int getStrength() {
        return 50;
    }

}
