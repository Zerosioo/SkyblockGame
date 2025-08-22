package me.zero.skyblock.items.itemlist.DUNGEON_PASS;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CATACOMBS_PASS_9 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Catacombs Pass IX";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CATACOMBS_PASS_9"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTg3MjM5NjEwOSwKICAicHJvZmlsZUlkIiA6ICI3NzkyNjJjYzRhZjc0NGU1OWJlYTEwNWEyOGExMWM1MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJMaWFuYW5Qcm9NYXgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTFhODFmOWIwYTEzNzU2ODFhZTdkOWRmNjVlNGQzNzIzYjFmMGZhNzQ0M2U3NmRkM2JjNjNkZDM4NjRmZjM0MyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
