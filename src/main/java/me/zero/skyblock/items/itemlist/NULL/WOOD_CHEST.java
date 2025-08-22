package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WOOD_CHEST extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Wood Chest+";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WOOD_CHEST"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjE0Njc1OSwKICAicHJvZmlsZUlkIiA6ICJiNzVjZDRmMThkZjg0MmNlYjJhY2MxNTU5MTNiMjA0YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJLcmlzdGlqb25hczEzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2UyNGE0ZDMyZDQzZDFjMmE5NDZiZTY0NjM1YzMxYTA3ZDAzMDBjZmRjYWJmNmYyM2M0ZjgyNDIwNzdjY2RiNmUiCiAgICB9CiAgfQp9";
    }

}
