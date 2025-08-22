package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TIGHT_PANTS_FRAGMENT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Tight Pants Fragment";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oTrue power lies","§7§oin cutting off","§7§oyour own","§7§ocirculation.")); 
    }

    @Override
    public String getId() {
        return "TIGHT_PANTS_FRAGMENT"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyNTk5MzA5OTYyOCwKICAicHJvZmlsZUlkIiA6ICJjZjc4YzFkZjE3ZTI0Y2Q5YTIxYmU4NWQ0NDk5ZWE4ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXR0c0FybW9yU3RhbmRzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2UxZjM2YzU4Y2Y1N2U2MTQ1MmJjOTY1OTJmY2Y0NmYyZGRmNTdkMzdlNWQ2ZWZjZmMxM2JlMjNkZGQ1ZWU5ZGIiCiAgICB9CiAgfQp9";
    }

}
