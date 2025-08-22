package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DRAGONTAIL_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to Dragontail";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DRAGONTAIL_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzOTUxMjYxNzc5MywKICAicHJvZmlsZUlkIiA6ICIwZjczMDA3NjEyNGU0NGM3YWYxMTE1NDY5YzQ5OTY3OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJPcmVfTWluZXIxMjMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjM2MzBkOWIwMjA4OGVhMTkyNGE4NzIyNDJhYmM3NWI2MjYyYzJhY2E5MmFlY2Y4NzE0YTU3YTQxZWVhMGI5ZCIKICAgIH0KICB9Cn0=";
    }

}
