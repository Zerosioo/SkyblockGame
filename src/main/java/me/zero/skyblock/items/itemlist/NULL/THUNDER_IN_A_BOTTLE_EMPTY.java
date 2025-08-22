package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class THUNDER_IN_A_BOTTLE_EMPTY extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Empty Thunder Bottle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "THUNDER_IN_A_BOTTLE_EMPTY"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MTI0Mjc1NzEwMCwKICAicHJvZmlsZUlkIiA6ICJiNzVjZDRmMThkZjg0MmNlYjJhY2MxNTU5MTNiMjA0YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJLcmlzdGlqb25hczEzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU3YTZkMzVlOWQ0MzU0MmQyNzUwYzQ4MzZiNDAzN2Y3NTE0NmViMjc4NzUzMmI0YzRjNWMzYjI2YmI2M2RjMTAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
