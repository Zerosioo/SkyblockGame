package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUILDER_BANANA_BUNCH extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Banana Bunch";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUILDER_BANANA_BUNCH"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5Mjg5NDY4MTgwMywKICAicHJvZmlsZUlkIiA6ICI4YzUzN2M3YWEzYjI0NWFmOGQ0ODY2YmIxZjhjMGU5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJCb0F0TmVlR2EiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQ3ZWY3MmI2MzcyOTk4ZGE5MWNiMDM0YzJhMmRiMjgzNjUyOTQ4MDIyNjY3ZWU0MDM3MzNiMTgyZmNlMGQ1MiIKICAgIH0KICB9Cn0=";
    }

}
