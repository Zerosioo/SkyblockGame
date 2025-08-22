package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STORM_THE_FISH extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Storm the Fish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STORM_THE_FISH"; 
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzExMTY1OSwKICAicHJvZmlsZUlkIiA6ICJlNDNiMjBiZTIyNWM0NzhkOTc5ZDJhNDllNjc4MWI1NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJMb3JkS2l3aXgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTRiMGU1MDQwMDZjYTI4ZDg1M2U0M2ZkY2VjZGJlNzU3YTY0ZWFkMjliYjg2YjVjNDE5OGU1YjcxM2RlNzgxNyIKICAgIH0KICB9Cn0=";
    }

}
