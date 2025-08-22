package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class END_STONE_SHULKER extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "End Stone Shulker";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "END_STONE_SHULKER"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MDAyODM5Nzk4NywKICAicHJvZmlsZUlkIiA6ICI0MjEwNTYxMWQxZjM0NzAyOTQ4NjE3OTYzMDY3NjY2NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUcmlraXRyYWthdGVsYXp6IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzExNzYwZTQyZDkwYTc5MDVmNGYwOTdjZmVkZDY0ZjUwOGRlZDUyZjMyY2M5OTFiYjViZTQ3YWJlZjZjZTY3OGQiCiAgICB9CiAgfQp9";
    }

}
