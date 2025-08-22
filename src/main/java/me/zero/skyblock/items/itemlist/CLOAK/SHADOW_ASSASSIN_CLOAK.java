package me.zero.skyblock.items.itemlist.CLOAK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SHADOW_ASSASSIN_CLOAK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Shadow Assassin Cloak";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SHADOW_ASSASSIN_CLOAK"; 
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
        return ItemType.CLOAK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public DungeonType getDungeonType() {
        return DungeonType.CATACOMBS;
    }

    @Override
    public int getStrength() {
        return 20;
    }

    @Override
    public int getSpeed() {
        return 3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MjI5ODIwNzA1MywKICAicHJvZmlsZUlkIiA6ICIzZWUxYWRlMzljZDI0ZjFkOWYwODliYjA2ZTkzNTY5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSdXNvR01SIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZhMjQzMTE0ODU3MmZlZDdiYzFlYWNmMGQyMjlkZGIyMTE1ZDFhMmNhMTgxZDMyM2QzZmNhNTIyNmU1MTZhMWQiCiAgICB9CiAgfQp9";
    }

}
