package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGMA_FISH_DIAMOND extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Diamond Magmafish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGMA_FISH_DIAMOND"; 
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
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.MYTHIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MjQ4ODAyMTk3MiwKICAicHJvZmlsZUlkIiA6ICI2OTBkMDM2OGM2NTE0OGM5ODZjMzEwN2FjMmRjNjFlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5emZyXzciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTliMzkzZWI2YTViZDY1ZDczNWFhYTNiM2NmYTk5M2I1MGY1ZTUzNmQ3YTEzYjUzNTUxNGJkMDc0MGQ2MzM1MCIKICAgIH0KICB9Cn0=";
    }

}
