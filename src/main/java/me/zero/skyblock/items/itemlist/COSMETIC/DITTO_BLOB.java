package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DITTO_BLOB extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ditto Blob";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DITTO_BLOB"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NTEzNjA0NzkyNCwKICAicHJvZmlsZUlkIiA6ICIyMzFmNmU0NWQ3YTc0ZTFlYWU3NGFhMWU5NmZlNDVlMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJXaW5zdHJlYWtlcnMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmU2ODE3YmQwNzA2NThlM2E1ZTFlN2Y1NWMxNmFjNzFhOTkwOWI3ZDBiMmMwMTEyMjdhNTJlZGYxYjBkNWI4MSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
