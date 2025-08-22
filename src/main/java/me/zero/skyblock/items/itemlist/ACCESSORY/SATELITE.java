package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SATELITE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Satelite";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SATELITE"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMzY2NjUwNTAzOCwKICAicHJvZmlsZUlkIiA6ICI0NTM1Y2RjNjk3NGU0Nzk4YjljYzY4ODlkZWY1MDk2NiIsCiAgInByb2ZpbGVOYW1lIiA6ICIzZXlyZW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGRjYmU4NTRiMDM4NmRjMzg5Zjc1Zjg3MTRiMjkyMmFjZDI0MjE5NTEwMDFjZmFiYTRhODFhYjY3ZTMzOGI5OSIKICAgIH0KICB9Cn0=";
    }

}
