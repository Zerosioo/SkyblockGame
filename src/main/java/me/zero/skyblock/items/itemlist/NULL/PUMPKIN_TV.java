package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PUMPKIN_TV extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pumpkin TV";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PUMPKIN_TV"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyNTYzOTE4MDcyMCwKICAicHJvZmlsZUlkIiA6ICI3ZGExYjViODdhMTg0NzgyOTQ2ZjZiYTdhMmNiMDhlMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSeWt1bk9jYXJhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZjZTUwOTg4MGRjYjQ0N2FmNjYwNjI2NzU4NDlhZmM3YjUxMDhlZTAxOTc5ZDZmMjk1NDNlZjAxY2FlNzdhNiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
