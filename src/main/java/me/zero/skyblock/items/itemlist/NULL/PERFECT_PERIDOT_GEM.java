package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PERFECT_PERIDOT_GEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Perfect Peridot Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PERFECT_PERIDOT_GEM"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNzY0MjI1MDE0MSwKICAicHJvZmlsZUlkIiA6ICI0MmIwOTMyZDUwMWI0MWQ1YTM4YjEwOTcxYTYwYmYxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJhaXJib2x0MDc4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzVhMjU4ODgzMWNkNGIyODJhYWExNjM1NmI3ODdkNTZlNGViMTNmMGQ2MmY0MTRkYWZkMTMxOGVhMDlmODAxOWMiCiAgICB9CiAgfQp9";
    }

}
