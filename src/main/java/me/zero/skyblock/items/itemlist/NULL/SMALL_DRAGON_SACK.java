package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SMALL_DRAGON_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Small Dragon Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SMALL_DRAGON_SACK"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MDE5MDg3MDUxOSwKICAicHJvZmlsZUlkIiA6ICIzYTE5NDgyNTYyZTc0MzFkYmNmOGUwOWE4N2VhMmQ5OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNckxpYW0yNjE0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU3Mzk0OTJiZTc4YzU3MmZiNGM2YmZhZjhmMTBiZDUyODU1M2I0M2FmNTc1YmEwNzNhY2JkMmM0YmY3N2M0MGIiCiAgICB9CiAgfQp9";
    }

}
