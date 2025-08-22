package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TALISMAN_ENRICHMENT_DEFENSE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Defense Enrichment";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TALISMAN_ENRICHMENT_DEFENSE"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MTE5NDgwMDUwOSwKICAicHJvZmlsZUlkIiA6ICJkZGVkNTZlMWVmOGI0MGZlOGFkMTYyOTIwZjdhZWNkYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEaXNjb3JkQXBwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JiOTcyOWQyYmViZmJlNzdlNGI0Y2Y3MDdhMjJkNmY4MjJkYzJkZThmNmIwNzBkODY3MzZjMTZkNTA4OWUxOTMiCiAgICB9CiAgfQp9";
    }

}
