package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HARD_STONE_GENERATOR_8 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hard Stone Minion VIII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HARD_STONE_GENERATOR_8"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTExMjY3OTY4MCwKICAicHJvZmlsZUlkIiA6ICI5OTdjZjFlMmY1NGQ0YzEyOWY2ZjU5ZTVlNjU1YjZmNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJpbzEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JkMjM5ZTIzYThiNGRjYTRhOGE1YjU2NWI1MjU0YmY4NjFhYWMyNGIzOGM3YzZlMmEwNmY0YTRiMGQ2NTgxOTMiCiAgICB9CiAgfQp9";
    }

}
