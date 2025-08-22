package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AGARICUS_CHUM_CAP extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Agaricus Chumcap";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "AGARICUS_CHUM_CAP"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3OTU4NjkxMjQzNywKICAicHJvZmlsZUlkIiA6ICI3ODI2YmJkOTJjZWI0ODVlYmIyZTY3M2Q4Y2E1ZGQxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJEZW1hcmt5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RlYzEzMjYzZGNkZWIzOTc5MjU2Mjc5MTdkZmZhNzE4MDQ0OTg4NjEzYzhjYTg5MDNjYjg0NDE1YzUyMzdjZGIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
