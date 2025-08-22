package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHUM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Chum";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHUM"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MTgwMDIzNTcxNSwKICAicHJvZmlsZUlkIiA6ICIzZGRhMDc1ZTQ0Yzc0MmZhODE2YTNjNTNkY2RlMWQ3ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJzbmFLQVkiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmMxNDg1NGU2NGFiMmYyMDVlM2MwYWE5ZjcwOTYxZjc0ZjNiMTIzNmMzZjQxOGFkODQwNzM2ODI1NmU3YmVjOCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
