package me.zero.skyblock.items.itemlist.GLOVES;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TITANIUM_GAUNTLET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Titanium Gauntlet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TITANIUM_GAUNTLET"; 
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
        return ItemType.GLOVES;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNzUyMTQzMzg2MiwKICAicHJvZmlsZUlkIiA6ICJkZDNjZGJiOTE2M2Q0NzgyOGQ0YmZkODZmYWE4NGY5ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJFTFdhbEtlUkpBSkEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2M4MDI3YzhhOGE2NzY3MDEwN2FkYWRlNDEwMjAwZjExYjIxYzkzYTEwMWE4ZWViMzI1OGVhYzM0NmQ1YzkwIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
