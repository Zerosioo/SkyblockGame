package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHEST_SHELVES extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Chest Storage";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHEST_SHELVES"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjIyODY3NiwKICAicHJvZmlsZUlkIiA6ICJiOTE5M2NiMjkzMWI0M2FhYmM1OGQ2NjAwMTg3NGRjMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJiMmJsYWtlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2EyODBkOWU1YTRhNGM5OGFmMGFlOTRjZjEwOTgwOGE5MWQwYTgwYjVjZDNmYmJmZmRmNjRhZDU5MjQyMTBlZDciCiAgICB9CiAgfQp9";
    }

}
