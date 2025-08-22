package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUNNY_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Bunny Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUNNY_PERSONALITY"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1ODU1ODcxNjgyODAsInByb2ZpbGVJZCI6IjkxZmUxOTY4N2M5MDQ2NTZhYTFmYzA1OTg2ZGQzZmU3IiwicHJvZmlsZU5hbWUiOiJoaGphYnJpcyIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTIwYTM3YjVkMDc5ZWI3OWQ4N2VkNWVkYTJjZjk1YTVhZTc2MTA2MmViMDk0OTllZjMzMDc4NDEwODgzY2E3MiJ9fX0=";
    }

}
