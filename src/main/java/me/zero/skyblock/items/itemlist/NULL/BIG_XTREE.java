package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BIG_XTREE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Tall Holiday Tree";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BIG_XTREE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDc2NjgzNzkwNiwKICAicHJvZmlsZUlkIiA6ICJjMTNkYzkxZjg1YjA0ZWM4OGU2NDk5YzdjZDc4Zjk3MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJjcnlwdGljX2Zyb2dfIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRmY2E5ZjBlNmM4ODllN2UxZWIxM2FhZWRjMWVjNjQ3NGQ5MGExYzQ2NTg3NjM4MGMzNDAzNWU4NGYzNWI2OTgiCiAgICB9CiAgfQp9";
    }

}
