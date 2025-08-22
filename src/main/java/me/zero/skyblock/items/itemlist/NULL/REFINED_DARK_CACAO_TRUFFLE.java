package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REFINED_DARK_CACAO_TRUFFLE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Refined Dark Cacao Truffle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REFINED_DARK_CACAO_TRUFFLE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMTQ2MjU4ODQwNSwKICAicHJvZmlsZUlkIiA6ICJmZjQ3NzI5YmQwZDI0YWYwOThiMTFjMGE3ZTFiMGVlZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXRzY2FuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRmOTkxMjE1ZTI1OGQ2NWY3N2VlZGViNjkzNTZmNTUyMWJiMjRjYjlkZDQ3NzY1ZTM4ZjUyYTg5MmQ3OTg5YWQiCiAgICB9CiAgfQp9";
    }

}
