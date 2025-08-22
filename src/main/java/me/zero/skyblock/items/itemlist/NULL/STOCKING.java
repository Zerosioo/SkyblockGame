package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STOCKING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Stocking";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STOCKING"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjkyNjIxMCwKICAicHJvZmlsZUlkIiA6ICJlNzMwZjIzNjFiMzE0NDRlODBlZjQzZTcwYTc5ZDM2ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJBeGVsS25pZmUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTFiZjViY2VkNzEzN2NhNjQ3NDk3OTE1MmY2NGYzYTg3MTc3ZGM2Mjk4YTc5NGJmYzAzMmNmMmNlZDQ4NzcwNSIKICAgIH0KICB9Cn0=";
    }

}
