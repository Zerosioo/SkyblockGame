package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WASTELAND_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to The Wasteland";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WASTELAND_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTI2NzY5Mzk3MSwKICAicHJvZmlsZUlkIiA6ICJkYmNlZjMyZjI5ZDc0Y2UzOTUzOWMwYjBhMTE1YjZiZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJyYW1waXJlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzkyYmYwM2VjNjhhOWZhNDE5OTFhYzg2Y2RmYjE2MWQ5ZDQ3YmZjOGQ1NmJlOWJlOTdmMWVkMzA3YjQ3YzM2NzQiCiAgICB9CiAgfQp9";
    }

}
