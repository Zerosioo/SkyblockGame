package me.zero.skyblock.items.itemlist.WAND;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOPE_OF_THE_RESISTANCE extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Staff of the Rising Sun";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HOPE_OF_THE_RESISTANCE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DOUBLE_PLANT;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.WAND;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzExMjM0ODIwYTFlN2JmYjkxMmI1MjJhZWNmMzRiZmNiNTY5ZjAyYmY1ODM2ZTY2OWEyOWJhZTk5NzM3ZTUyMiJ9fX0=";
    }

}
