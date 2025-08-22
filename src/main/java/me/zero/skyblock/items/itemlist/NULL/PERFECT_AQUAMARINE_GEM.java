package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PERFECT_AQUAMARINE_GEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Perfect Aquamarine Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PERFECT_AQUAMARINE_GEM"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNzY0MDU0NDMzMiwKICAicHJvZmlsZUlkIiA6ICIyMDZlMWZkYjI5Yzk0NGYxOTQ5OTg4NzAwNTQxMGQ2NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJoNHlsMzMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjU1YzhhYWM4OTkwZTQ1NmFiZjM1MDMwMTE1ZTM2YzdjNTY2NzgyZTEzZDgxYjFhNzcwOTk1ZmE1ZjM3YzgyMiIKICAgIH0KICB9Cn0=";
    }

}
