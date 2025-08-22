package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RUSTY_SHIP_ENGINE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Rusty Ship Engine";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RUSTY_SHIP_ENGINE"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MDMyMTg4MDgzNywKICAicHJvZmlsZUlkIiA6ICIyZmI1ZGJhYTY2NTA0OGEyYjZhYzU5YWE2Nzk5MDYzNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJkcmFnbG9uZXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNlODQ3OTM5MTdjODkwZjdmOGEyYzQwNzhhMjllOGJhOTM5NzkwNDk4NzI3YWY5MzQyYzJiNmY2YWM0M2M5YyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
