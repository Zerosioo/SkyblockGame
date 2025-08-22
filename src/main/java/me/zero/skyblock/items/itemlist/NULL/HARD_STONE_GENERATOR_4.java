package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HARD_STONE_GENERATOR_4 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hard Stone Minion IV";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HARD_STONE_GENERATOR_4"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxOTExMjc0MTIwNiwKICAicHJvZmlsZUlkIiA6ICI2MTZiODhkNDMwNzM0ZTM3OWM3NDc1ODdlZTJkNzlmZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJfX25vdGFodW1hbl9fIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y1ZDZlNzFmZTg0YjkzMTVkNDEwYmM0ZGRmMGRhZWNlZTRmMWQ5MjdiNmNhMTE1Y2I1YjdiMDZlNTcxYTBlYiIKICAgIH0KICB9Cn0=";
    }

}
