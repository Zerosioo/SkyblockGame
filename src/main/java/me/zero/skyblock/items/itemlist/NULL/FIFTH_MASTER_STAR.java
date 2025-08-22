package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIFTH_MASTER_STAR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fifth Master Star";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FIFTH_MASTER_STAR"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTgwMjUyNDkxMywKICAicHJvZmlsZUlkIiA6ICJkZTE0MGFmM2NmMjM0ZmM0OTJiZTE3M2Y2NjA3MzViYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTUlRlYW0iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzFjODA0MjUyN2Y4MWM4ZTI5M2UyODEwMTEzNDg5ZjQzOTRjYzZlZmUxNWQxYWZhYzQzMTU3MWM3M2I2MmRjNCIKICAgIH0KICB9Cn0=";
    }

}
