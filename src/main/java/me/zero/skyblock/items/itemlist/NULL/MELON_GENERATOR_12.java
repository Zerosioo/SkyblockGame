package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MELON_GENERATOR_12 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Melon Minion XII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MELON_GENERATOR_12"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTQ1NDIxNTMzNiwKICAicHJvZmlsZUlkIiA6ICJiZWNlZGU1YmRkODY0YTkwOTc3MTRmODk0ZWUxNmE3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTYW1hQ29tcG9zZXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmZiNTMyOWRjNjA4NWFmYWIyMzZhM2NjMTI0NWRmZjFmMjI3YzMzNDE4ZTA4ZWRhYzQ3YjUzMDUwMTgxM2NkNSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
