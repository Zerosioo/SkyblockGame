package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PEST_REPELLENT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pest Repellent";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PEST_REPELLENT"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5Njk0NDk5ODgzNSwKICAicHJvZmlsZUlkIiA6ICI0YjJlMGM1ODliZjU0ZTk1OWM1ZmJlMzg5MjQ1MzQzZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJfTmVvdHJvbl8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTg1Njg5MTgyOWY1ZTEyNWMyNTIwMTZhZTdlNDg0NmVmMzllNzBmZTBlYzEzMmI1YTUxMjZjZWFhMGE2NWY0NCIKICAgIH0KICB9Cn0=";
    }

}
