package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JERRY_TALISMAN_BLUE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Blue Jerry Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JERRY_TALISMAN_BLUE"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getIntelligence() {
        return -2;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MDIwOTU4MywKICAicHJvZmlsZUlkIiA6ICJiZmQ3MjMxMGNmYWY0Yjc5OTNlYzhiYzU3ODg3YzU5ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbHBoYVNwQW0iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDNiOTE5ZjA0MDkyMmViMTc3MzNiNDJkMjE2YjdjZGVmZWFlYTM2NmJlMTRjMWFlNjk5M2NhN2U1OTA5ZTBmMCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
