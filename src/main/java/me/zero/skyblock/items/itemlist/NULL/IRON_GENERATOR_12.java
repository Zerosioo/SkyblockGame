package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IRON_GENERATOR_12 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Iron Minion XII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "IRON_GENERATOR_12"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDY1NjUwODI1MywKICAicHJvZmlsZUlkIiA6ICI0OWIzODUyNDdhMWY0NTM3YjBmN2MwZTFmMTVjMTc2NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJiY2QyMDMzYzYzZWM0YmY4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzlmY2ZmMzZkM2E3NzE3YThhYWEzMzc1NjI0MjNiMGQ4ODRmZWY2YWFiMTJhNDY3ZmEzNjBlNTU5NzU5NzJjNjIiCiAgICB9CiAgfQp9";
    }

}
