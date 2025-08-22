package me.zero.skyblock.items.itemlist.ARROW;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGMA_ARROW extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Magma Arrow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGMA_ARROW"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ARROW;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.ARROW;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public int getDamage() {
        return 40;
    }

    @Override
    public int getCritChance() {
        return 10;
    }

}
