package me.zero.skyblock.items.itemlist.DEPLOYABLE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RADIANT_POWER_ORB extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Radiant Power Orb";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RADIANT_POWER_ORB"; 
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
        return ItemType.DEPLOYABLE;
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
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNzQ0Nzk4NTQxNCwKICAicHJvZmlsZUlkIiA6ICI2OTBkMDM2OGM2NTE0OGM5ODZjMzEwN2FjMmRjNjFlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5emZyXzciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzk0ZDBhMDY4ZWE1MGE5ZGUyY2VmMjNhOTJiY2E0YjM2NzhkMTJjYThhMTgxNWQxM2JlYWM5NGRmZDU1NzEyNSIKICAgIH0KICB9Cn0=";
    }

}
