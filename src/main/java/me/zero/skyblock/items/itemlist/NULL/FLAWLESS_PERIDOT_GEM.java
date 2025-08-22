package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAWLESS_PERIDOT_GEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Flawless Peridot Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAWLESS_PERIDOT_GEM"; 
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
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNzY0MjI2OTYzMSwKICAicHJvZmlsZUlkIiA6ICIxZDIyYmUxYmQ2YTM0NWQ0OTI0Nzc4YmM4YWFlMjYzMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNQVJTX0hYIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE4ODRhOGRjYjcxMjgzNDFjZTA5Y2IzNjE2YzExYzNlNDZmODBkMDgzYTZmMmRiYjRkYmUwYmI5MzIzMThiMDkiCiAgICB9CiAgfQp9";
    }

}
