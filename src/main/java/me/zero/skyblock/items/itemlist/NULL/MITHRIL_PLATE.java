package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MITHRIL_PLATE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Mithril Plate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MITHRIL_PLATE"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 10108;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDYzMjE0MDk0MSwKICAicHJvZmlsZUlkIiA6ICIwZjczMDA3NjEyNGU0NGM3YWYxMTE1NDY5YzQ5OTY3OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJPcmVfTWluZXIxMjMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWJjMWZkN2VjMWExMTQ1MDYzMjM5MDk1YjE3MTM1NTY4ZTMxODhiZTIwM2IzMThhOTg5ZGY0OTY0YjhjZjJlMCIKICAgIH0KICB9Cn0=";
    }

}
