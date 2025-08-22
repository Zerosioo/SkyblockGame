package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WHITE_TIGER_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "White Tiger Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WHITE_TIGER_PERSONALITY"; 
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
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0OTQzNjMzOTg5MSwKICAicHJvZmlsZUlkIiA6ICJmZTYxY2RiMjUyMTA0ODYzYTljY2E2ODAwZDRiMzgzZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNeVNoYWRvd3MiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODgxNTdjNzJkN2Q0ZmI5NTE2MTdmYzZhOGEzMDFmN2NkMGVlNmEzNzg2ZDZlYTIyNzk0OTk0NjIxMjRmMzM1YiIKICAgIH0KICB9Cn0=";
    }

}
