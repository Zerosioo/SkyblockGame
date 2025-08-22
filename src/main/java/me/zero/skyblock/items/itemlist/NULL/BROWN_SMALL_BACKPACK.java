package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BROWN_SMALL_BACKPACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Small Backpack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BROWN_SMALL_BACKPACK"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTUzODcwMTgyOSwKICAicHJvZmlsZUlkIiA6ICJlZTg4M2RmMjM0ZWI0YWM1YTFlNDEwODhhYzZkZWIxNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUdW5lc0Jsb2NrIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzEyNWU2NjY3NzYzNDliNTk1NDkyMDI5Y2YwZWNiOWE3MjQ3Y2ZhNWZlNGMwNDhmYjE0YWUyY2EyN2Y0ZjlkM2UiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
