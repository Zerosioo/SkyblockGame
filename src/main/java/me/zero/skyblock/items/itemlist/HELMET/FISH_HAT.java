package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FISH_HAT extends SItem implements ItemStatistics, SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Fish Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FISH_HAT"; 
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
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.STARTER;
    }

    @Override
    public int getPrice() {
        return 24;
    }

    @Override
    public int getHealth() {
        return 5;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNTQyODkxNzAzMSwKICAicHJvZmlsZUlkIiA6ICJmMGIzYmRkMjEwNDg0Y2VlYjZhNTQyYmZiOGEyNTdiMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbm9uaW1ZVFQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTAyM2M0MzI1ZWUwM2YzZTdlYjdhNDQ3ZGVjNzc5ZjlhZjc2MmI5NjNkMGZhMmEyYmQwMzllZGVhZThlM2JhMiIKICAgIH0KICB9Cn0=";
    }

}
