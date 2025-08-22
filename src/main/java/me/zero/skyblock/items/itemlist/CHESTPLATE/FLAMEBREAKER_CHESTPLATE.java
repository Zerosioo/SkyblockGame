package me.zero.skyblock.items.itemlist.CHESTPLATE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAMEBREAKER_CHESTPLATE extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Ember Ash Chestplate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAMEBREAKER_CHESTPLATE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHAINMAIL_CHESTPLATE;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.CHESTPLATE;
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
    public int getMiningFortune() {
        return 5;
    }

    @Override
    public int getMiningSpeed() {
        return 15;
    }

}
