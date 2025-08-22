package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SQUASH_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Squash Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SQUASH_HELMET"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getFarmingFortune() {
        return 25;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2Mzc1Mzg1NTk5NiwKICAicHJvZmlsZUlkIiA6ICJiNjQ3MDE3MmZiM2Q0NDU5YTIzOGFkMzZiZTgxOTc3YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUWXRyYWNrMjMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGUxMDg3YzBjNTE5YTlhMWRjZWU0MzI1NDEwYjE5YTFiZTQ4NTVlYWM1YTY2MmFlMWI1MjMzMjlmOTBmYWVjZCIKICAgIH0KICB9Cn0=";
    }

}
