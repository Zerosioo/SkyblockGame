package me.zero.skyblock.items.itemlist.AXE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SWEET_AXE extends SItem implements ItemStatistics, Sellable, Museum {

    @Override
    public String getName() {
        return "Sweet Axe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SWEET_AXE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_AXE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.AXE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.STARTER;
    }

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public int getDamage() {
        return 25;
    }

}
