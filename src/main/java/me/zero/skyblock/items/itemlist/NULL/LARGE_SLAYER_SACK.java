package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LARGE_SLAYER_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Large Slayer Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LARGE_SLAYER_SACK"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NTQwNDA2NCwKICAicHJvZmlsZUlkIiA6ICJmODg2ZDI3YjhjNzU0NjAyODYyYTM1M2NlYmYwZTgwZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJOb2JpbkdaIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2MwY2NiZDE1ZDc2YTc0OGUwODkyNmVmNmQyMWRjM2U1NGQ5YWRlYzc2NmNjMjUwMTk1MzFhNDkzYjFmZDRiNDQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
