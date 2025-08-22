package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ETERNAL_HOOF extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Eternal Hoof";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ETERNAL_HOOF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_BARDING;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

}
