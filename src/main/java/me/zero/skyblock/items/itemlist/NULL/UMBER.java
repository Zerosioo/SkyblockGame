package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UMBER extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Umber";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§oHardy enough to","§oflourish even in","§othe harshest of","§oconditions.")); 
    }

    @Override
    public String getId() {
        return "UMBER"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODkxOTkzMjc2MSwKICAicHJvZmlsZUlkIiA6ICJiMmM5ZTUyZjNhODU0YzQ4YmJjMmMwM2JjM2U0NzdiMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJJU05FRVpFREFUWU9VIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I1NjViNWFhODNkNGFhN2Y3YWYyMmRjMTI3MWIyZjBiMjc0NDFmOWFjMTQ5NWY2YjQ2NTNjZjY4ZGZiMTA1ZWYiCiAgICB9CiAgfQp9";
    }

}
