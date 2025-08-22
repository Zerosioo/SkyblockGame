package me.zero.skyblock.items.itemlist.NECKLACE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BALLOON_SNAKE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Balloon Snake";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BALLOON_SNAKE"; 
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
        return ItemType.NECKLACE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.AMATEUR;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getHealth() {
        return 10;
    }

    @Override
    public int getIntelligence() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MjI5ODI0MDc0MSwKICAicHJvZmlsZUlkIiA6ICI2ZDgwYjVkMjQyMGY0MWZkOTQxMjM4YzA3YzVlYzAxNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJQb05pWW8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTUzMDg4ZGUzZWRmZDFiMTA5OGQ4ZDhmNTZmNTAwNGE4OTMwNTUxZTA2M2M3Nzg5MWZhMDA3MDNjZjAzMWI5OSIKICAgIH0KICB9Cn0=";
    }

}
