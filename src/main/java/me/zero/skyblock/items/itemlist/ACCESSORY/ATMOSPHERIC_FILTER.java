package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ATMOSPHERIC_FILTER extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Atmospheric Filter";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ATMOSPHERIC_FILTER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SKULL_ITEM;
    }

    @Override
    public byte getDurability() {
        return 3;
    }

    @Override
    public ItemType getItemType() {
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 100000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5Njk0NTA0NTgxMCwKICAicHJvZmlsZUlkIiA6ICI0NDAzZGM1NDc1YmM0YjE1YTU0OGNmZGE2YjBlYjdkOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTa3lSZWFsbVNwaWVsZXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDNjZjVjZDkyYzFiYTBhN2Q3YmIxZjg3MmNjZGI5NTFjYTg5N2QzNDAwNDA0NTdhMzI0MjcxNjA2YzViYmM1NiIKICAgIH0KICB9Cn0=";
    }

}
