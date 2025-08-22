package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CUP_OF_BLOOD extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Cup of Blood";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oEww")); 
    }

    @Override
    public String getId() {
        return "CUP_OF_BLOOD"; 
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
        return 200;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MjMzNTQwMTA2OCwKICAicHJvZmlsZUlkIiA6ICIzOTg5OGFiODFmMjU0NmQxOGIyY2ExMTE1MDRkZGU1MCIsCiAgInByb2ZpbGVOYW1lIiA6ICI4YjJjYTExMTUwNGRkZTUwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQzMWNkN2VkNGU0YmYwN2MzZGZkOWJhNDk4NzA4ZTczMGU2OWQ4MDczMzVhZmZhYmMxMmQ4N2ZmNTQyZjZhODgiCiAgICB9CiAgfQp9";
    }

}
