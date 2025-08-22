package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FESTIVE_JERRY_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Festive Jerry Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FESTIVE_JERRY_PERSONALITY"; 
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
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODEyMjczMzU3NiwKICAicHJvZmlsZUlkIiA6ICJmZDQ3Y2I4YjgzNjQ0YmY3YWIyYmUxODZkYjI1ZmMwZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgyZGMzZDJmMGQ1N2RiMzlkMGQwNDUzZTJiMGRlZjkxZGFhZTE1ZWVlMzE4Y2ZhZThjMDg2NjMzMTQzMGQxMTQiCiAgICB9CiAgfQp9";
    }

}
