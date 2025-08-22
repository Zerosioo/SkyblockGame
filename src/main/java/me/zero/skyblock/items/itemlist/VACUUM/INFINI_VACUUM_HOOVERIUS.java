package me.zero.skyblock.items.itemlist.VACUUM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFINI_VACUUM_HOOVERIUS extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "InfiniVacuum™ Hooverius";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFINI_VACUUM_HOOVERIUS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EXPLOSIVE_MINECART;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.VACUUM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

}
