package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MERCENARY_LEGGINGS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Mercenary Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MERCENARY_LEGGINGS"; 
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
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public int getPrice() {
        return 15000;
    }

    @Override
    public int getHealth() {
        return 60;
    }

    @Override
    public int getDefense() {
        return 60;
    }

}
