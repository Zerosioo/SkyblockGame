package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLAY_GENERATOR_12 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Clay Minion XII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CLAY_GENERATOR_12"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTczNjQyODQ4NjIwMywKICAicHJvZmlsZUlkIiA6ICJmNTBjOGRkN2FiN2Y0ZmUyYWI4ZGI1M2NjYzRiYWQxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYWNoYWRvVF9UIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU1ZWU1NTYxYTkzODhiYjBhN2ZiN2UwNjZiNGY4Mjg2MzFkNjg2OWQ3MzcwMmZlMjM0NmU1YjMwNjY4YWMwMzUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
