package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POTATO_BASKET extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Basket of Hope from the Great Potato War";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POTATO_BASKET"; 
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
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyODkxODY5Njc5MiwKICAicHJvZmlsZUlkIiA6ICIzNDkxZjJiOTdjMDE0MWE2OTM2YjFjMjJhMmEwMGZiNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJKZXNzc3N1aGgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjU3N2VjNzIzZTAyZmNiM2NjMGFkNjE4NTdiNjA2NTFhYzAwNzc4OWY1YWUyZjU5Nzk1NzU4YTEyMGJjZWMzOSIKICAgIH0KICB9Cn0=";
    }

}
