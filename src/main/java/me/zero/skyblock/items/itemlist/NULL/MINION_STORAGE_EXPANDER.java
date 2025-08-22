package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MINION_STORAGE_EXPANDER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Minion Storage X-pender";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MINION_STORAGE_EXPANDER"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5NzYyNDk4ODg5MywKICAicHJvZmlsZUlkIiA6ICJmNjE1NzFmMjY1NzY0YWI5YmUxODcyMjZjMTEyYWEwYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGZWxpeF9NYW5nZW5zZW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2RjMzZlMjRmNDExOWZjZjNiNWZiM2MxYTFkZWNmNjYyZjlmNzcxNTYyZjM0YTYwODM0MGYxMzg5YjRlZjliNiIKICAgIH0KICB9Cn0=";
    }

}
