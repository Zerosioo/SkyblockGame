package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NETHERITE_HELMET extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Netherite Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "NETHERITE_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHAINMAIL_HELMET;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.HELMET;
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
    public int getHealth() {
        return 40;
    }

    @Override
    public int getDefense() {
        return 40;
    }

    @Override
    public int getMiningFortune() {
        return 10;
    }

    @Override
    public int getMiningSpeed() {
        return 25;
    }

}
