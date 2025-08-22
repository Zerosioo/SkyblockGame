package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JERRY_BOX_BLUE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Blue Jerry Box";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JERRY_BOX_BLUE"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMTc2NDY1Mzc1OSwKICAicHJvZmlsZUlkIiA6ICIzOWEzOTMzZWE4MjU0OGU3ODQwNzQ1YzBjNGY3MjU2ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJkZW1pbmVjcmFmdGVybG9sIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZhYzMxMWZhYjdhYzczNzgyYjIyMTIwMGU2Y2Q0YWNiYmIyMTdjNjJlNzg3YjIxMzYzNWQ1ZTUyZjc1YzM3MmIiCiAgICB9CiAgfQp9";
    }

}
