package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AGARIMOO_TALISMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Agarimoo Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "AGARIMOO_TALISMAN"; 
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
    public int getFishingSpeed() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3NzgxNzk1MjE1MiwKICAicHJvZmlsZUlkIiA6ICJkMTJiOTk3ZWI2YTQ0ODQ5ODJmNDE1ZTI1NzFlNmY4NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUd2lybGJlbGwiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2Q1OTdmNzdjZGUzMmM5YWM5YjA2ZjgyZmNmN2M5Y2I1MDBmYWNjMTRiZmYxNjYyMjJiMjRiZTM5OTYyZjBlZiIKICAgIH0KICB9Cn0=";
    }

}
