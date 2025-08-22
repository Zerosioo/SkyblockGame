package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RIFT_COMPLETION_MEMENTO extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "There and Back Again";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oThis book will","§7§onever find a","§7§opublisher.")); 
    }

    @Override
    public String getId() {
        return "RIFT_COMPLETION_MEMENTO"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOOK;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

}
