package me.zero.skyblock.items.itemlist.NECKLACE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STARRED_BONE_NECKLACE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bone Necklace";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STARRED_BONE_NECKLACE"; 
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
        return ItemType.NECKLACE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getCritChance() {
        return 5;
    }

    @Override
    public int getDefense() {
        return 45;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MjI5ODE4Nzc4NiwKICAicHJvZmlsZUlkIiA6ICI1MWIyZGY3NWEyYWM0OTA5YmM4YzlkMzM3Y2EwNDNkYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJMaWNvcm5lQXVCZXVycmUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWEzNjFhNjdiNjNkMDQ1YTBhNjNiNTI1YzFhNzAxMjhmNjkwOWVmMWFjN2JjYzZlNDYzMWViODk1ZjA3NTAyZCIKICAgIH0KICB9Cn0=";
    }

}
