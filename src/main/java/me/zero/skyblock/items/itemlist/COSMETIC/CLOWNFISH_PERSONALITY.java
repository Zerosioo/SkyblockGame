package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLOWNFISH_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Clownfish Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CLOWNFISH_PERSONALITY"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MTgxMzQ4NTE3MiwKICAicHJvZmlsZUlkIiA6ICI5MThhMDI5NTU5ZGQ0Y2U2YjE2ZjdhNWQ1M2VmYjQxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJCZWV2ZWxvcGVyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzExOTgxMmNjNTdiNzhjMzM2NmQwNzY3Nzg3NDVmN2Q4MWU5MzY3NjlhOGQyOGNhYzY4ZDQ4MzZmZmU5NTgxMjEiCiAgICB9CiAgfQp9";
    }

}
