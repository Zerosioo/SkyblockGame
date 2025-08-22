package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VILLAGE_TALISMAN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Village Affinity Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VILLAGE_TALISMAN"; 
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
    public int getPrice() {
        return 200;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzNjkyMTIxOSwKICAicHJvZmlsZUlkIiA6ICI2ZDRmODcwODhiYjY0NTA4OTZkZWYzN2I3Njk3MmY2YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ3aGF0aXN0aGlzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzc4MTQ5ZDc1ODdkOGRlNzM3NjEyNjFiZDJkNGNkM2Y5ZTk3OTc5ZTU5OTg4OGU2ZmFhNGJjNmY5Y2RmMTAxNDIiCiAgICB9CiAgfQp9";
    }

}
