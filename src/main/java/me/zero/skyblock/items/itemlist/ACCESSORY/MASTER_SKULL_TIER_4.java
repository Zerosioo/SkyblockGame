package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MASTER_SKULL_TIER_4 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Master Skull - Tier 4";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MASTER_SKULL_TIER_4"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTg2MzU2Mzg5NywKICAicHJvZmlsZUlkIiA6ICI3NTE0NDQ4MTkxZTY0NTQ2OGM5NzM5YTZlMzk1N2JlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGFua3NNb2phbmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmExNTNhZmVkYTFmODBjYjM4MmI1Y2MzMTcxNzUxMDJhMWQ5ZmJkMWQ2YzI2YzkyNTQzMzk3OWE2MzU2NTAxNCIKICAgIH0KICB9Cn0=";
    }

}
