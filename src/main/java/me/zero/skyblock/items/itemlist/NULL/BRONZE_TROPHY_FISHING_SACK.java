package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BRONZE_TROPHY_FISHING_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bronze Trophy Fishing Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BRONZE_TROPHY_FISHING_SACK"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NDkzODU4MjQ0OSwKICAicHJvZmlsZUlkIiA6ICJhYTA3ZjM2Mjk0NTM0YzYwODQzMjI4NzAzZTBlMjE3OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJfU2FrdXlhX0l6YXlvaV8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODdjZDM2ZTA5ZDdjNDhmNzFiOWM4ODA5Y2RlNWM5YmI2MGEzNmIzMTkzZjMyYjQ5MzEyNWUzNTk1ZmQ3NTdkYSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
