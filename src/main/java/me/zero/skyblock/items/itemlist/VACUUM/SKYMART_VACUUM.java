package me.zero.skyblock.items.itemlist.VACUUM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SKYMART_VACUUM extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "SkyMart Vacuum";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SKYMART_VACUUM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MINECART;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.VACUUM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

}
