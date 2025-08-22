package me.zero.skyblock.items.itemlist.LEGGINGS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAMEBREAKER_LEGGINGS extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Ember Ash Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAMEBREAKER_LEGGINGS"; 
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
