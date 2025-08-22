package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JERRY_BARN_SKIN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Jerry Barn Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JERRY_BARN_SKIN"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwOTgxMDIwNzcxMSwKICAicHJvZmlsZUlkIiA6ICI0ZDcwNDg2ZjUwOTI0ZDMzODZiYmZjOWMxMmJhYjRhZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzaXJGYWJpb3pzY2hlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ1ZjcyOTczNjk5NmEzOGUxODZmZTlmZTdmNWEwNGIzODdlZDAzZjM4NzFlY2M4MmZhNzhkOGEyYmRkMzExMDkiCiAgICB9CiAgfQp9";
    }

}
