package me.zero.skyblock.items.itemlist.PICKAXE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REFINED_TITANIUM_PICKAXE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Polished Titanium Pickaxe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REFINED_TITANIUM_PICKAXE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_PICKAXE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.PICKAXE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 14500;
    }

    @Override
    public int getDamage() {
        return 65;
    }

    @Override
    public int getMiningSpeed() {
        return 200;
    }

}
