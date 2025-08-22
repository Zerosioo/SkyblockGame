package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GHAST_LEGGINGS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Ghast Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GHAST_LEGGINGS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHAINMAIL_LEGGINGS;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.LEGGINGS;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 2800;
    }

    @Override
    public int getHealth() {
        return 150;
    }

}
