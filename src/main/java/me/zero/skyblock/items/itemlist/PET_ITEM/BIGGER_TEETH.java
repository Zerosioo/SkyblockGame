package me.zero.skyblock.items.itemlist.PET_ITEM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BIGGER_TEETH extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Bigger Teeth";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BIGGER_TEETH"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GHAST_TEAR;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.PET_ITEM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

}
