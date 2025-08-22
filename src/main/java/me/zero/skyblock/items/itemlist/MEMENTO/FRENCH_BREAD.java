package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FRENCH_BREAD extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "French Bread";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FRENCH_BREAD"; 
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
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMzA2NjkwODk5OSwKICAicHJvZmlsZUlkIiA6ICI2ZDRmODcwODhiYjY0NTA4OTZkZWYzN2I3Njk3MmY2YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ3aGF0aXN0aGlzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ3OGY3YTY4ZTIwMDRlOGYzZjhhZTU5MTlkNmEzZDg4NjBiZTAzY2VmZWIzY2Q1MjM3ZWRlZmE3NzFlODdhMDEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
