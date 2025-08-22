package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BINGO_DISPLAY extends SItem implements ItemStatistics, Museum {

    @Override
    public String getName() {
        return "Bingo Display";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Show off your","§7total §6Bingo","§6Points§7!")); 
    }

    @Override
    public String getId() {
        return "BINGO_DISPLAY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COAL_BLOCK;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

}
