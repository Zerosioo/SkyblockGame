package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PERFECT_TOPAZ_GEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Perfect Topaz Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PERFECT_TOPAZ_GEM"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNDk3OTE3ODQ1MywKICAicHJvZmlsZUlkIiA6ICJiYzRlZGZiNWYzNmM0OGE3YWM5ZjFhMzlkYzIzZjRmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICI4YWNhNjgwYjIyNDYxMzQwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzNkYTZlY2RjYmMzZmUzNTVjYTA2MTExOTJhM2ZiZDM1ZGQ1NjM1ZDVmY2RmM2ZiYzc5ZWQyYmMxZjRhMDE3ZmUiCiAgICB9CiAgfQp9";
    }

}
