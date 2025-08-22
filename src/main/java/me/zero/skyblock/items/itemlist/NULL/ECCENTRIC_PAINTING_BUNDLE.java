package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ECCENTRIC_PAINTING_BUNDLE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Eccentric Painting Bundle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ECCENTRIC_PAINTING_BUNDLE"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 9;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3MjU1NDQ3NTA3MSwKICAicHJvZmlsZUlkIiA6ICI4N2YzOGM1MWE4Yzc0MmNmYTY2YTgxNWExZTI2NzMzYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJCZWR3YXJzQ3V0aWUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODI0Zjc2OWM5NDUwZjIyZTQ4NGUwODljYTAyZTMyNGZlMzdiMThmNGMxOGVmMjk2MDIxODcxYmE0YWQwYzM5NiIKICAgIH0KICB9Cn0=";
    }

}
