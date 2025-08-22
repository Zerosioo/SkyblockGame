package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_ITEM_TOY_JERRY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Jerry 3D Glasses";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_ITEM_TOY_JERRY"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzY5MzEyMywKICAicHJvZmlsZUlkIiA6ICJkNWQ5NzUxOTNjMTM0MzAyYTU5MjRmODQ0NWQ4YzAwNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJzYWludGVkbGl0dGxlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2EyZjY1NzdiNzQ1N2MxZGJlOTA2ZGE3ODVhMWE4NTBhM2Y4MWU1MzJmODJjMTZlMWY2M2VhMGVhZTFlN2QwZjIiCiAgICB9CiAgfQp9";
    }

}
