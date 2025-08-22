package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BITTER_ICE_TEA extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bitter Iced Tea";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BITTER_ICE_TEA"; 
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
        return Rarity.COMMON;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzczOTc0NCwKICAicHJvZmlsZUlkIiA6ICIwNTAzNzZmZjAxY2I0OGVjOTUwM2NhMjhjMWU2MzlkMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJKb25haDU1OTAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjY4NmJjZjgwOGI5YTQwMjRhMmM5YTg3YTY3NGU4ZDljOTU3NTkzYzhiZjc4OTdjMWM5ZmVlMTljNDQ1YmUxOCIKICAgIH0KICB9Cn0=";
    }

}
