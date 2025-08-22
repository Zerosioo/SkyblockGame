package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WITHER_RELIC extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Wither Relic";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WITHER_RELIC"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzOTQ4MTEzMywKICAicHJvZmlsZUlkIiA6ICJjNTBhZmE4YWJlYjk0ZTQ1OTRiZjFiNDI1YTk4MGYwMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUd29FQmFlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE3YjhlZjdlOGUwYWYxOTM5OWNjMzI0ODVmMmVlNDdiMmJiNGQ1ODAyYzcxYjMwMjFmNGQ1ZDZiNWYzYWZlMDMiCiAgICB9CiAgfQp9";
    }

}
