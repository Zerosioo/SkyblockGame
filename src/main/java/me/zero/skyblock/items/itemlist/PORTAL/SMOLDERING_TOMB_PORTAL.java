package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SMOLDERING_TOMB_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to the Smoldering Tomb";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SMOLDERING_TOMB_PORTAL"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MzA2NTgyNTY5MiwKICAicHJvZmlsZUlkIiA6ICIxN2Q0ODA1ZDRmMTA0YTA5OWRiYzJmNzYzMDNjYmRkZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJnaWZ0bWV0b25uZXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjIwNjU3ZTI0YjU2ZTFiMmY4ZmMyMTlkYTFkZTc4OGMwYzI0ZjM2Mzg4YjFhNDA5ZDBjZDJkOGRiYTQ0YWEzYiIKICAgIH0KICB9Cn0=";
    }

}
