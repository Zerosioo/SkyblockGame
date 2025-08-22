package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FARMING_2_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to Mushroom Island";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FARMING_2_PORTAL"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1OTI4MzE1MDc5MCwKICAicHJvZmlsZUlkIiA6ICJkYmQ4MDQ2M2EwMzY0Y2FjYjI3OGNhODBhMDBkZGIxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ4bG9nMjEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzBkZWQ3Njk3NzU1ZDUyYWU2NDg3NTgxNGE3NzgxNjhmZGQ1ZjliOThlMjgzMDU5MDRhNzM4NDNhODQ2OTEzNiIKICAgIH0KICB9Cn0=";
    }

}
