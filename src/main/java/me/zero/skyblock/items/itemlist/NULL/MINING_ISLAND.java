package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MINING_ISLAND extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mining Island";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MINING_ISLAND"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxODk5OTA3NDY4NiwKICAicHJvZmlsZUlkIiA6ICI3ODc0OTU4NzQ5Y2Q0NzBiYjEyYTY2NmNkZTVkODVmMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYW50cmlYeEQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTUyODU4ZGEyMmNjNzRmYTVlOTkxMThjNDdjMTZlN2FhNGQ0NWI4Mzk0YWU5YjczMzkwMWRkM2EyYzg4NWQzZSIKICAgIH0KICB9Cn0=";
    }

}
