package me.zero.skyblock.items.itemlist.PET_ITEM;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DWARF_TURTLE_SHELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Dwarf Turtle Shelmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DWARF_TURTLE_SHELMET"; 
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
        return ItemType.PET_ITEM;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODcyMzE0MDkwMiwKICAicHJvZmlsZUlkIiA6ICI5NDczNjdlMTE1N2Q0ZjQzYTZmYmY0MGQwOTY3MjY3MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ2ZXJzeXNtYXN0ZXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmFjMTUxMDYxMGQ1MDQ0M2ZkOTdmMzRhNmU5NGUyMWQwYjkzZDVjNzUyOWYzZDk1YzE4MTZjZTI0YTEzZGM4NCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
