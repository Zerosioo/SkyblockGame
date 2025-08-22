package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GREENHOUSE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Greenhouse Planter";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GREENHOUSE"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3OTk1MDk5ODU0NywKICAicHJvZmlsZUlkIiA6ICI5Mzg2ZDQ3Nzg4YzU0ODdiYWIzMDE2MGJjOWRiZTcwNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbGlBYnJhbmQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGViNWVlZTQyNTM1ZDY4Y2NlNWJmOTUyMDEzN2I3YTM2Y2IzMTNkYzY1YmRjZDg4MDQzNTNhMjkxOTRmOTIyYyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
