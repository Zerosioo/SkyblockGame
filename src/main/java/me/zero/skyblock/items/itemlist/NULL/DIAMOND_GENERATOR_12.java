package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_GENERATOR_12 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Diamond Minion XII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_GENERATOR_12"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDY1NjYxNTUxOCwKICAicHJvZmlsZUlkIiA6ICJmZDYwZjM2ZjU4NjE0ZjEyYjNjZDQ3YzJkODU1Mjk5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E1OWM4YTY1MDE0NzIxYjdkYzYxMmNlZmNhZGYyNjNmMDQ5NmM0MTQzMDkzN2QxODAyZDZjZmFkOTk0N2M4N2IiCiAgICB9CiAgfQp9";
    }

}
