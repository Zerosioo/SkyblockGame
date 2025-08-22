package me.zero.skyblock.items.itemlist.PICKAXE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BANDAGED_MITHRIL_PICKAXE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Bandaged Mithril Pickaxe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BANDAGED_MITHRIL_PICKAXE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_PICKAXE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.PICKAXE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public int getDamage() {
        return 30;
    }

    @Override
    public int getMiningFortune() {
        return 4;
    }

    @Override
    public int getMiningSpeed() {
        return 250;
    }

}
