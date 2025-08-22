package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGMA_FISH extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Magmafish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGMA_FISH"; 
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
    public int getPrice() {
        return 20;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MjQ4ODA3MDY2NiwKICAicHJvZmlsZUlkIiA6ICIzNDkxZjJiOTdjMDE0MWE2OTM2YjFjMjJhMmEwMGZiNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJKZXNzc3N1aGgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjU2YjU5NTViMjk1NTIyYzk2ODk0ODE5NjBjMDFhOTkyY2ExYzc3NTRjZjRlZTMxM2M4ZGQwYzM1NmQzMzVmIgogICAgfQogIH0KfQ==";
    }

}
