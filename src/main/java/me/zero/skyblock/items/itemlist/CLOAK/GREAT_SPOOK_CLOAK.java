package me.zero.skyblock.items.itemlist.CLOAK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GREAT_SPOOK_CLOAK extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Great Spook Cloak";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GREAT_SPOOK_CLOAK"; 
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
        return ItemType.CLOAK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MzUxNzA0ODY2MSwKICAicHJvZmlsZUlkIiA6ICI2NmI0ZDRlMTFlNmE0YjhjYTFkN2Q5YzliZTBhNjQ5OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBcmFzdG9vWXNmIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzVkYzEyMzFiYmI5Nzc2NDFiOWI0YTg1NDNlY2Y2NjA2ZjNhOTkwYmJhYmFlMzAwMTBiZDE1Y2RmMDcxOTM0OCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
