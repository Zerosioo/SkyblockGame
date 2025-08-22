package me.zero.skyblock.items.itemlist.VACUUM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFINI_VACUUM extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "InfiniVacuum™";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFINI_VACUUM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STORAGE_MINECART;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.VACUUM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

}
