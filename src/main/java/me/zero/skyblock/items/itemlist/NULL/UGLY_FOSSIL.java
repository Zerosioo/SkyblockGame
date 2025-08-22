package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UGLY_FOSSIL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Ugly Fossil";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("The ugliest fossil","to ever exist. It","has a face only a","mother could love.")); 
    }

    @Override
    public String getId() {
        return "UGLY_FOSSIL"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 50000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODY0MzQ1MDczNCwKICAicHJvZmlsZUlkIiA6ICJiMmM5ZTUyZjNhODU0YzQ4YmJjMmMwM2JjM2U0NzdiMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJJU05FRVpFREFUWU9VIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZkYmIyODYzODFkOGE1YTJkOTllMTI5ZmViMjc3NjUzMGU0YzMxMzM1ZjcwOWZjZDNlNGJhYTZhZWI1Y2JlZGEiCiAgICB9CiAgfQp9";
    }

}
