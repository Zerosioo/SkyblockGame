package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UMBER_PLATE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Umber Plate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "UMBER_PLATE"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwOTU4MjI3MjAwNywKICAicHJvZmlsZUlkIiA6ICJmOGJmNDBjOWExYzY0ZTllOTIyZTc4M2UwMzNiODBiMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUeGxvbjUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODgxMjRkYmZiYjE1NjNhNzM1MmYzN2IwOTEyNzZkZGNkNjk3NTg1MGJlMTAxZDJmODhkNDI2NThiM2Q1YTBhMCIKICAgIH0KICB9Cn0=";
    }

}
