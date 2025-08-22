package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FESTIVE_ZOMBIE_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Festive Zombie Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FESTIVE_ZOMBIE_PERSONALITY"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODEyMzAxNjAxMSwKICAicHJvZmlsZUlkIiA6ICI3NzI3ZDM1NjY5Zjk0MTUxODAyM2Q2MmM2ODE3NTkxOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJsaWJyYXJ5ZnJlYWsiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWNjYjQxNWY4N2ExNzMyMjFkMWE5OWVlNzhkMTlmYjk4YzEyNmUyM2EwNjc3ZGQwZWUxNzgwM2QxN2JhNGI1YyIKICAgIH0KICB9Cn0=";
    }

}
