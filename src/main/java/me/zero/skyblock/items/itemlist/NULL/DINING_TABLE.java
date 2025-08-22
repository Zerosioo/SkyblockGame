package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DINING_TABLE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Dining Table";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DINING_TABLE"; 
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
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjA2NDA2MiwKICAicHJvZmlsZUlkIiA6ICJmMTYwZTMxMzJjYWM0YjRiOWM5OTk2NDQ1OGIxOWM0ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUb255S0tLIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzhhNmQ0ZDUxNmE5YjQwNTMwYzI3OGQ3ZjEzYTUwNjMyNmFjMGE3NDJlNTA2OTNiMWExYzEwYWU0YzE0NzAyMTYiCiAgICB9CiAgfQp9";
    }

}
