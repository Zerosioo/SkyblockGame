package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLAZE_HAT extends SItem implements ItemStatistics, SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Blaze Hat";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLAZE_HAT"; 
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
    public int getPrice() {
        return 20;
    }

    @Override
    public int getStrength() {
        return 20;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE0OTk3MTAzNjk1MTEsInByb2ZpbGVJZCI6IjRjMzhlZDExNTk2YTRmZDRhYjFkMjZmMzg2YzFjYmFjIiwicHJvZmlsZU5hbWUiOiJNSEZfQmxhemUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I3OGVmMmU0Y2YyYzQxYTJkMTRiZmRlOWNhZmYxMDIxOWY1YjFiZjViMzVhNDllYjUxYzY0Njc4ODJjYjVmMCJ9fX0=";
    }

}
