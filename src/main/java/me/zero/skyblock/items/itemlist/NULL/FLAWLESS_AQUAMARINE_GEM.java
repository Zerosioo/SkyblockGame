package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAWLESS_AQUAMARINE_GEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Flawless Aquamarine Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAWLESS_AQUAMARINE_GEM"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNzY0MDU2MjAxNiwKICAicHJvZmlsZUlkIiA6ICIyNjRkYzBlYjVlZGI0ZmI3OTgxNWIyZGY1NGY0OTgyNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNb2phbmdIYXNBU3R1ZGlvIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2QzNzY5OWJkZjhjYjQzZWZmMTQ3ZDljZTE5YjE0ODAyZjliYzg4YTIxZTYzYWQyOGI2Njk1MzBlOGEzYzBiNTciCiAgICB9CiAgfQp9";
    }

}
