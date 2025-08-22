package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HONEY_JAR extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Honey Jar";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HONEY_JAR"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5Njg3MDM5MTEzNCwKICAicHJvZmlsZUlkIiA6ICJiMTRiMjY2NzgxOTU0ZGM1OTUzYTRkYWQ5MjRiZGRjNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJHOWxfIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Q4ZWNkNjM2MTUwODM3YjBkOWQwMjk5YjY0Y2QwYjViNTVhNmY5OTE1OGM5NDYwMGViOTBmYzViYTY3NzMzMGQiCiAgICB9CiAgfQp9";
    }

}
