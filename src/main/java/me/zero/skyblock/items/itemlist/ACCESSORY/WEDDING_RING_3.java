package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WEDDING_RING_3 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Rubbish Ring of Love";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WEDDING_RING_3"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTQyMjE2ODIwMiwKICAicHJvZmlsZUlkIiA6ICIyMmNiM2U0ZDdmOTY0ZmNjYjE1MDIyNWIwN2YzMTEyMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0dWxleW1hbkIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODY5MGMxOGUyYjg3ODBjOTI3ZmQxMjFkNWEzNjE5NmE1M2E3MmM2NzBhODlkNzg1ZGVlZGVlMzE1NTAyNGIyYSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
