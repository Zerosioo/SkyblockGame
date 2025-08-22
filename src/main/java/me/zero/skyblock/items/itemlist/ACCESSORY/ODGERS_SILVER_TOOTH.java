package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ODGERS_SILVER_TOOTH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Odger's Silver Tooth";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oA perfectly fine","§7§otooth, besides a","§7§obroken chunk...")); 
    }

    @Override
    public String getId() {
        return "ODGERS_SILVER_TOOTH"; 
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
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0Mzg4NjIyNDI3NiwKICAicHJvZmlsZUlkIiA6ICIwZjczMDA3NjEyNGU0NGM3YWYxMTE1NDY5YzQ5OTY3OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJPcmVfTWluZXIxMjMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzJkNDFiMjI3OWFiY2U1ZmQ2MjY5MjNiNjFlM2FiOThkY2U0OTcyNDE3Mjg5ZWUyYjczMjE0YzBhYWJhODQxZSIKICAgIH0KICB9Cn0=";
    }

}
