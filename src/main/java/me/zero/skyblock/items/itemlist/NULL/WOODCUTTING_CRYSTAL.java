package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WOODCUTTING_CRYSTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Woodcutting Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WOODCUTTING_CRYSTAL"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MjA4Mzk1NTQyNSwKICAicHJvZmlsZUlkIiA6ICI2MTI4MTA4MjU5M2Q0OGQ2OWIzMmI3YjlkMzIxMGUxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJuaWNyb25pYzcyMTk2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ4Njg4Y2NmNWNjYjRlMTVjODkxNWFiMWM5MTk4YzNkNTdkOWM0NjcxZjhjMGEwY2MwYzlmNWFlN2IyNzM5YjQiCiAgICB9CiAgfQp9";
    }

}
