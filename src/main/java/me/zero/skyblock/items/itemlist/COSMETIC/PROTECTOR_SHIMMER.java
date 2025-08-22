package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PROTECTOR_SHIMMER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Shimmer Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PROTECTOR_SHIMMER"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.MYTHIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNTk5NzEyMDI1MSwKICAicHJvZmlsZUlkIiA6ICJhNzdkNmQ2YmFjOWE0NzY3YTFhNzU1NjYxOTllYmY5MiIsCiAgInByb2ZpbGVOYW1lIiA6ICIwOEJFRDUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzJjZDEyMDg0MTIyOGQyODEyY2EwNzQzM2EzZWM0NjQwZGU4MWZhMWY0YmI5YjQyMjY5Yzc0MTQwMzE5NmZkYiIKICAgIH0KICB9Cn0=";
    }

}
