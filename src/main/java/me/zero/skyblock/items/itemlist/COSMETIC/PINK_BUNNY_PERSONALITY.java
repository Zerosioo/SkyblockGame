package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PINK_BUNNY_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Pink Bunny Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PINK_BUNNY_PERSONALITY"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNjk2MDExNDY4NiwKICAicHJvZmlsZUlkIiA6ICJiMGQ3MzJmZTAwZjc0MDdlOWU3Zjc0NjMwMWNkOThjYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJPUHBscyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kN2NkZGY1YjIwY2I1MGQ2NjAwZTUzMzNjNmJiM2ZiMTViNDc0MWYxN2UzNjc1ZmMyYmZjMDljMmNkMDllNjE5IgogICAgfQogIH0KfQ==";
    }

}
