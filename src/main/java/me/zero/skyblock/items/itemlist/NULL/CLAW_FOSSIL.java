package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLAW_FOSSIL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Claw Fossil";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A small but sharp","claw once used for","digging tunnels.")); 
    }

    @Override
    public String getId() {
        return "CLAW_FOSSIL"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 10000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODY0MzUwNzkyNywKICAicHJvZmlsZUlkIiA6ICI0MmIwOTMyZDUwMWI0MWQ1YTM4YjEwOTcxYTYwYmYxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJBaXJib2x0MDc4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdjOTVjMDdiZDAxMDBmMmQwNWNkNmU5YThjOGE4MzUxODdlMzEzOTMxNmJlZmI0ZjM3NDhjM2U2ODU5MTQxZmMiCiAgICB9CiAgfQp9";
    }

}
