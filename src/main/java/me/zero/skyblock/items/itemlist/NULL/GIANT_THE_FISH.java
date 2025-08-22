package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GIANT_THE_FISH extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Giant the Fish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GIANT_THE_FISH"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5OTkyNjkxNjY5MCwKICAicHJvZmlsZUlkIiA6ICJkOWQ2YTNjZDQ0ZWI0MjBlYWM2MTA2ZmQyMTNmZGRiYSIsCiAgInByb2ZpbGVOYW1lIiA6ICI5VDkiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDk1NDA4OTY5NGIwN2UyZjIzZGE3M2M1MjMzZGQ5NTFkMjI2OTdlYzE0OGRmMTFhYzViMGE4NTcwZDRjNWVkNyIKICAgIH0KICB9Cn0=";
    }

}
