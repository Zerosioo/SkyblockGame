package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MINI_SANDCASTLE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mini Sandcastle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MINI_SANDCASTLE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MjA5Njk0NDY5NiwKICAicHJvZmlsZUlkIiA6ICI3ZGEyYWIzYTkzY2E0OGVlODMwNDhhZmMzYjgwZTY4ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJHb2xkYXBmZWwiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTkxODI4MWFmOTA1NjMzYWQ3Y2I4M2M3ZTM5YjFlNWViMjUyZmZhMTdkMGRiYzdlMmIwYWJlNmYzZDE5ZjFjOSIKICAgIH0KICB9Cn0=";
    }

}
