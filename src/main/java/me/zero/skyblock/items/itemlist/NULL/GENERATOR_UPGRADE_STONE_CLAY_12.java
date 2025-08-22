package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GENERATOR_UPGRADE_STONE_CLAY_12 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Clay Minion XII Upgrade Stone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GENERATOR_UPGRADE_STONE_CLAY_12"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTczNzk5NzE4NjY3MSwKICAicHJvZmlsZUlkIiA6ICJkMDlkOTg1NzRiNjM0ZmNiOWNiN2I5MWZhYmE4ZGIzYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEdWNrVGVsbHoiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQyMDhlN2M3MTc4MjkyZTNiMTZjODhkNTlhMmVkMDMyNTE5YzMxYWM1YTI3ZTYwNjZjNWY5YWU2ZDVlNWE1OCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
