package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUMMONING_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Summoning Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SUMMONING_RING"; 
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzNTcxNzczNjM4NiwKICAicHJvZmlsZUlkIiA6ICIwNjNhMTc2Y2RkMTU0ODRiYjU1MjRhNjQyMGM1YjdhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJkYXZpcGF0dXJ5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzc3MGQxNTk5ZWVmZDU2MjFkMTBhYjY5OTYzZDJhOWIxYjBjOWExZTg5OTllYTg4YTU5NzcyNDQ1ZWQyZjAzOTYiCiAgICB9CiAgfQp9";
    }

}
