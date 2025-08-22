package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLDEN_PLATE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Golden Plate";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLDEN_PLATE"; 
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
        return 3068;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDYzMjAyMDczMiwKICAicHJvZmlsZUlkIiA6ICIxNzhmMTJkYWMzNTQ0ZjRhYjExNzkyZDc1MDkzY2JmYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJzaWxlbnRkZXRydWN0aW9uIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZhNWZkMDljZWM0ZmU5N2NjYzc3NjIxYjczZDg5YWQ2ZTQ1ZDc5MzExN2Y1NzY1NTdkNjUzODQ1YWNiNGYwYWQiCiAgICB9CiAgfQp9";
    }

}
