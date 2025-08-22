package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUILDER_CORN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Corn";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUILDER_CORN"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MjMzNjg3MTUxNzgsInByb2ZpbGVJZCI6IjIzZDE4YjNhN2E1NjQyM2E4NDZmZGJlNGVjYjJmNzJmIiwicHJvZmlsZU5hbWUiOiJHZW1pbml4UGxheXMiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2QzOTFkZmZiZWEyZmMzZjJhZDc4YTYyM2Y0OWJmN2UxMTIxNjk0MTEyYzM3NTlmZWVkNDE1NmZjMmJhNDZjMCJ9fX0=";
    }

}
