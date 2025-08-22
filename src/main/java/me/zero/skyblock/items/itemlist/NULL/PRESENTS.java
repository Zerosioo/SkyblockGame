package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRESENTS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Present Stack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PRESENTS"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNTMwNDE3NjMwMywKICAicHJvZmlsZUlkIiA6ICI3OTZjMDBhNmY0MDA0Mjg2OWMyMTIyNjc0ZmI0MWNiZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZWRvbnlhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZmNWM0MzM5MDg3MzJiNTEyZjY4NDYxYzE0ZWYwMjBiYjJmNTVkOTZhNjFjZDFkNDVlYTFlN2VhODk5ZjFhNmIiCiAgICB9CiAgfQp9";
    }

}
