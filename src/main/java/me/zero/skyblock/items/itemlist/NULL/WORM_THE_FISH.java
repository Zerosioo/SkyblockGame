package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WORM_THE_FISH extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Worm the Fish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WORM_THE_FISH"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1NTg2NzUwNTEzOSwKICAicHJvZmlsZUlkIiA6ICIxOTQzY2VmYzM4NWM0YTJjYWJiZGViODBjZTIwM2RjZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzb29vb29vb29vb29vb29wIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE5YWY5NWJlM2RkYTlmNmEwZTY1MTU1OGNmZTMyMzIwYjA1NjQ2MzlkN2NlZTIyYTlmZTMzMWEyNGJhNWIyYjQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
