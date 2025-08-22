package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARACHNE_SANCTUARY_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to Arachne's Sanctuary";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARACHNE_SANCTUARY_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3MDQ3OTE5ODQyOCwKICAicHJvZmlsZUlkIiA6ICJmMTA0NzMxZjljYTU0NmI0OTkzNjM4NTlkZWY5N2NjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJ6aWFkODciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzVlMjQ4ZGEyZTEwOGYwOTgxM2E2Yjg0OGEwZmNlZjExMTMwMDk3ODE4MGVkYTQxZDNkMWE3YThlNGRiYTNjMyIKICAgIH0KICB9Cn0=";
    }

}
