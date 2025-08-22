package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OLD_SHIMMER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Shimmer Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "OLD_SHIMMER"; 
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
        return Rarity.MYTHIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNTk5NTI0MjAzNywKICAicHJvZmlsZUlkIiA6ICI4MmM2MDZjNWM2NTI0Yjc5OGI5MWExMmQzYTYxNjk3NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb3ROb3RvcmlvdXNOZW1vIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzc4YmY2MDZmNWFjZTRlM2NmYjgxYTE0NzQyOTkyZmY1YTg2OGQxZjBmOWQxNGI0YmVjOTM5Mzg1OWUwZTBhMDAiCiAgICB9CiAgfQp9";
    }

}
