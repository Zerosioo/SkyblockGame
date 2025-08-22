package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LUSH_TALISMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Lush Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LUSH_TALISMAN"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1NzY0MDExODc1NCwKICAicHJvZmlsZUlkIiA6ICI1NTZjNDNmOWJmZjU0MjI1OTI0NDU5M2EwN2QyYzE1MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJHaW50b2tsIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFmNGY2NWQ4YTQ5ZWI1MTg3MjE4OTA4Y2RlNDNjNTg5ZDExMzk0MmViYzQzYzVkMTJlZWE3YzgxZjM1OWM3NjkiCiAgICB9CiAgfQp9";
    }

}
