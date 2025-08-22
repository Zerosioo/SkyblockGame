package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HYPIXEL_CASTLE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hypixel Sandcastle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HYPIXEL_CASTLE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzcyNzcwOSwKICAicHJvZmlsZUlkIiA6ICI4NDQ4OWQyOGNmYTQ0YmNlOTU4ZGIyODM0ZDFjYjNjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJEZU0wUkciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzM4YWIzNTA2NDE5OWQ5ODk4ODA2YTllNGM4ZWJhMTFhZTVlN2ExZjkwYzU4ZjE5NDAzNzZiZTg1NmMyYzY4OSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
