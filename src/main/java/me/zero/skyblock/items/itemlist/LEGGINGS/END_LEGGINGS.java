package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class END_LEGGINGS extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Ender Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "END_LEGGINGS"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public int getHealth() {
        return 25;
    }

    @Override
    public int getDefense() {
        return 50;
    }

}
