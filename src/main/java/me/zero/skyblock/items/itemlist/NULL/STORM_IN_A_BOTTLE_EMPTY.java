package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STORM_IN_A_BOTTLE_EMPTY extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Empty Storm Bottle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STORM_IN_A_BOTTLE_EMPTY"; 
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
    public int getPrice() {
        return 5000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMTcxMDg4ODA4MSwKICAicHJvZmlsZUlkIiA6ICI1OTgyOWY1ZGY3MmM0ZmFlOTBmOGVhYmM0MjFjMzJkYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJQZXBwZXJEcmlua2VyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdjNDg3ZGRiN2FmMGJlM2RhOThhMWNkZjkwMTAwODEwMTFmNTJhYzk0YWVhNDdiNzFkNGFkZmFiNjVkMmU0ZWIiCiAgICB9CiAgfQp9";
    }

}
