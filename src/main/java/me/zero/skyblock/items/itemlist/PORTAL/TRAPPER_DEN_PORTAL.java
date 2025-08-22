package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TRAPPER_DEN_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to the Trapper's Den";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TRAPPER_DEN_PORTAL"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNzgxMTUyOTk0MCwKICAicHJvZmlsZUlkIiA6ICJhMjk1ODZmYmU1ZDk0Nzk2OWZjOGQ4ZGE0NzlhNDNlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJWaWVydGVsdG9hc3RpaWUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjEwMmY4MjE0ODQ2MWNlZDFmN2I2MmUzMjZlYjJkYjNhOTRhMzNjYmE4MWQ0MjgxNDUyYWY0ZDhhZWNhNDk5MSIKICAgIH0KICB9Cn0=";
    }

}
