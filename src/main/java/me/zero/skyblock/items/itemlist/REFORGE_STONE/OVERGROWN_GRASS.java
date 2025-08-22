package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OVERGROWN_GRASS extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Overgrown Grass";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "OVERGROWN_GRASS"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3ODgyMjIzNjU2NiwKICAicHJvZmlsZUlkIiA6ICJhYzIzZmEzNzRhMmM0YjU2YmYzYzU2ZTVhODY3NjIzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJxdWVlbnNoYW5pd2EiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzhiZjMzYWVhY2Y4ZjU1OWQ4MjA3YTUzNDQ5YjI4YTc5ODZiNDFkZWQ0ODI2MzE2NDBkYmIxODkyYzY1NGNjNyIKICAgIH0KICB9Cn0=";
    }

}
