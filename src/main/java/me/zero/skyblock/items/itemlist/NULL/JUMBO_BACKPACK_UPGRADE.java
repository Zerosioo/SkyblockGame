package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JUMBO_BACKPACK_UPGRADE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Jumbo Backpack Upgrade";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JUMBO_BACKPACK_UPGRADE"; 
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
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MDA1NjIzOSwKICAicHJvZmlsZUlkIiA6ICI1N2I3OWE2NTllZTM0ODhmODBhM2ExOGQwNDYxMTg3YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaW1hdGlrX1giLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjYwOWYxY2JhYWY2OTIxM2VhNGQ2ODJhNTc1NTBlMTM3MDNhMGNjNjM3MmYzYWJjMThkNmUzNzIxMTI1NzMxYyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
