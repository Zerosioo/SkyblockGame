package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CAMPFIRE_TALISMAN_28 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Campfire God Badge";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CAMPFIRE_TALISMAN_28"; 
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
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5Njk4NDEzOTI4NCwKICAicHJvZmlsZUlkIiA6ICJkZTU3MWExMDJjYjg0ODgwOGZlN2M5ZjQ0OTZlY2RhZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNSEZfTWluZXNraW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTRkM2U5ZWE2MGU0ZjVhMGUyMjBhMjI1ZWU5NGY4MWE5MjkzNTUyZWJhM2VhMGVmOWM1OGU1N2JhZTkzOGNjNCIKICAgIH0KICB9Cn0=";
    }

}
