package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CARNIVAL_MASK_BAG extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Carnival Mask Bag";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CARNIVAL_MASK_BAG"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNTAyMzkwMjQyMSwKICAicHJvZmlsZUlkIiA6ICJkYzA5MjA4MTM2ZDg0Y2Y5OWIwMzFmMGI1NzM4OTdmNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJLRUlUSF8wMzAyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ0YWY5NDMzNzFkNzZlNWRiNWRlYjkzZGYyZWFmMTRkOWIwZTAzYTE2NDhiZWU3ZjkwMTI2YWJmODk4M2MxZDYiCiAgICB9CiAgfQp9";
    }

}
