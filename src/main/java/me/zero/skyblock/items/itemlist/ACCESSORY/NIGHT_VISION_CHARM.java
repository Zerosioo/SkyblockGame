package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NIGHT_VISION_CHARM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Night Vision Charm";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "NIGHT_VISION_CHARM"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 2500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzNDgwNjAxNCwKICAicHJvZmlsZUlkIiA6ICI2OTBkMDM2OGM2NTE0OGM5ODZjMzEwN2FjMmRjNjFlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5emZyXzciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2MzMjg5YWZkMmE1ZTk3ZGMyOWRkYzAxYmFhYjllZTM0ODkzNDhjZWJiOWYxNWQ0ZGY0OGMzZDQ2ODYxZmQ3NSIKICAgIH0KICB9Cn0=";
    }

}
