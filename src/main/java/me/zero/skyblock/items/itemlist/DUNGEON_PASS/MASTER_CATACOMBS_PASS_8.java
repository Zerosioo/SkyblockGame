package me.zero.skyblock.items.itemlist.DUNGEON_PASS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MASTER_CATACOMBS_PASS_8 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Master Catacombs Pass VIII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MASTER_CATACOMBS_PASS_8"; 
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
        return ItemType.DUNGEON_PASS;
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNzExMDc2NTU5OCwKICAicHJvZmlsZUlkIiA6ICI3NzI3ZDM1NjY5Zjk0MTUxODAyM2Q2MmM2ODE3NTkxOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJsaWJyYXJ5ZnJlYWsiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDY1Y2JjZTQwZTYwZTdhNTlhODdmYThmNGVjYjZjY2ZjMTUxNDMzOGMyNjI2MTRiZjMzNzM5YTYyNjNmNTQwNSIKICAgIH0KICB9Cn0=";
    }

}
