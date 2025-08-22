package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_GIFT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "§cRed Gift";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RED_GIFT"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMzAwMjIxMjY2MCwKICAicHJvZmlsZUlkIiA6ICJmZDYwZjM2ZjU4NjE0ZjEyYjNjZDQ3YzJkODU1Mjk5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM0OWIyZjA4YWM0ZTk4NGVjOTk5YjVlZTI2NDg1NGNjNmE2ZGZmMjNjYmM5NzU3OGVkMTA1MjFmZGNkMGU4MzIiCiAgICB9CiAgfQp9";
    }

}
