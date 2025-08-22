package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ODGERS_BRONZE_TOOTH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Odger's Bronze Tooth";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oA perfectly fine","§7§otooth, besides","§7§osome wear and","§7§otear...")); 
    }

    @Override
    public String getId() {
        return "ODGERS_BRONZE_TOOTH"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0Mzg4NjI4NTI3NywKICAicHJvZmlsZUlkIiA6ICI0MzE4YzBjMzY2ZGU0Y2NlOTIwMzlhZTJiODQ5NWNmYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJCbGFja1RoZUN1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2FjY2M0NDMyZWZlMDhjODg1MzBhYzA4NGZlYTY1MjY2NDFhMjA3ZDc4ZTYzN2U0MWY3YTRlNWRjZmRhYWExNjIiCiAgICB9CiAgfQp9";
    }

}
