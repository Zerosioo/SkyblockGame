package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_TUNGSTEN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Enchanted Tungsten";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_TUNGSTEN"; 
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
    public int getPrice() {
        return 1600;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODkxNDY2MjE1NCwKICAicHJvZmlsZUlkIiA6ICJlNzhjY2YyNjMxZTY0MjJkOGY1YzE3ZTliZGQ3N2RjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJEQU5JRUwxOTB5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJhNDQxY2IxOTQxZDMyYWQ3ZGQyNTVlMDU3ZjJkZDM1Mjk5MDQ2Y2FhYTU0NGJlOTY4ZTBiNzRkNjlmNzE5OWQiCiAgICB9CiAgfQp9";
    }

}
