package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MIMIC_CHEST extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mimic Chest";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MIMIC_CHEST"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3Mjc2NTM1NTU0MCwKICAicHJvZmlsZUlkIiA6ICJhNWVmNzE3YWI0MjA0MTQ4ODlhOTI5ZDA5OTA0MzcwMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJXaW5zdHJlYWtlcnoiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTE5YzEyNTQzYmM3NzkyNjA1ZWY2OGUxZjg3NDlhZThmMmEzODFkOTA4NWQ0ZDRiNzgwYmExMjgyZDM1OTdhMCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
