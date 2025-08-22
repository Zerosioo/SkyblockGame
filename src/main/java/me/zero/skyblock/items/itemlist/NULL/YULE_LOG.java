package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YULE_LOG extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Yule Log";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "YULE_LOG"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MDY3NzQxMjQ4OCwKICAicHJvZmlsZUlkIiA6ICI0MjEwNTYxMWQxZjM0NzAyOTQ4NjE3OTYzMDY3NjY2NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUcmlraXRyYWthdGVsYXp6IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU5YmQ0NWFhZDY5YmQzMDVjNTVkN2M5M2IxYjM0ZjJmNDdkY2E4YWYyZTA2NGIyYmY1YjhkYmUwOWY1NGEwYjgiCiAgICB9CiAgfQp9";
    }

}
