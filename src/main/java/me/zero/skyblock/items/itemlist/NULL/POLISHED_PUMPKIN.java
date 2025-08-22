package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POLISHED_PUMPKIN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Polished Pumpkin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POLISHED_PUMPKIN"; 
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
        return 256000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODcwMzE3NzQ0MiwKICAicHJvZmlsZUlkIiA6ICJmN2QxOWQxNTZhY2I0NDE2OGQ4YTAxYThkNWYwMmEyZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVGbG9vZDQyNEsiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWFiYTAxNTI0OTUxYWRkMjFmYjUzZWZmODllOTk3NjU3NThhOWIyYjY1YTk3YzBlYmJhY2IzYWY1ZTA2MjQwZSIKICAgIH0KICB9Cn0=";
    }

}
