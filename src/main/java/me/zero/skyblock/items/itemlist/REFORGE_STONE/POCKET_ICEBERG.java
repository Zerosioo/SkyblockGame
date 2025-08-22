package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POCKET_ICEBERG extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Pocket Iceberg";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POCKET_ICEBERG"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMzczNjE4NTgzNiwKICAicHJvZmlsZUlkIiA6ICIxZGI3ZjUxYWZmOWM0NTcyOGZmNmU5MjMxMmZhZGZkOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJsdXNtZW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTUwY2MxNTYzZTZlZTZhZTRmNjI5YmQ3ZjlkZTk1MGExOGM0ZmI0ZmJiNWQ4MmM3ZWI5MzA2NGMzOGU1OTI0IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
