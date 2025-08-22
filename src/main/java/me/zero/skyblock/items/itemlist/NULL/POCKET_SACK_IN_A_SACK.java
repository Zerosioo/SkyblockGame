package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POCKET_SACK_IN_A_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pocket Sack-in-a-Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POCKET_SACK_IN_A_SACK"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NTYwMDU1ODIyMSwKICAicHJvZmlsZUlkIiA6ICJmNWYyNDcyZGVhNDY0ODJhYWUwNDllYjM2ODE5ODU0NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJEZXRhaWxlcnMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzQ0MmM2NmY0YmY5YWE0MjU2ZmE3YjQ5YzYzNjdkNDY1ODQwOGVjNDA4NDc3ODc5YWM4MDc2Nzk0NDAyZDk1YiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
