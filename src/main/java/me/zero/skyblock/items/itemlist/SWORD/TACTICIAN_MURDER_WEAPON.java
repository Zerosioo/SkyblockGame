package me.zero.skyblock.items.itemlist.SWORD;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TACTICIAN_MURDER_WEAPON extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Tactician's Murder Weapon";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TACTICIAN_MURDER_WEAPON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_SWORD;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.SWORD;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
