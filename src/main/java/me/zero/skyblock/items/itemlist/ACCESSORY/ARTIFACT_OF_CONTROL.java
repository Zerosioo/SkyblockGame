package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARTIFACT_OF_CONTROL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Artifact of Control";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARTIFACT_OF_CONTROL"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1ODg3MTIxMDY1MywKICAicHJvZmlsZUlkIiA6ICJmNThkZWJkNTlmNTA0MjIyOGY2MDIyMjExZDRjMTQwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ1bnZlbnRpdmV0YWxlbnQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzFmNzQ4YTQzZjNiM2FkYTA0ZjQ0ZDVkMjkwYThiOWJmNTgzZDkzZTFjODNhYjkzYzYwYzRkZWMxZmRlMWM1YyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
