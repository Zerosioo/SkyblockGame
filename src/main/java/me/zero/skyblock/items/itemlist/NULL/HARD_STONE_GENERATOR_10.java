package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HARD_STONE_GENERATOR_10 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hard Stone Minion X";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HARD_STONE_GENERATOR_10"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTExMjY0OTI4MiwKICAicHJvZmlsZUlkIiA6ICIwNjNhMTc2Y2RkMTU0ODRiYjU1MjRhNjQyMGM1YjdhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJkYXZpcGF0dXJ5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzVjMmUzZmY2ZDEzMTQ0MDIxMWRmZGZmNzZhZDE1MDA3YmM5MTI0M2E4MzU5ZDZhNjdiNzg0ZTM3ZjkwMGQ3ZjAiCiAgICB9CiAgfQp9";
    }

}
