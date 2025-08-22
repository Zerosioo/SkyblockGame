package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRESUMED_GALLON_OF_RED_PAINT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Presumed Gallon of Red Paint";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PRESUMED_GALLON_OF_RED_PAINT"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyODg5ODI5NjE5NSwKICAicHJvZmlsZUlkIiA6ICJiNTM5NTkyMjMwY2I0MmE0OWY5YTRlYmYxNmRlOTYwYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXJpYW5hZmFnIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU5MGQzYzUyMmNlNTMzYjY1OTc1NTZjMDZkODBhZWJlYjI2NDBlZTBkMWJmOGM0OTg3NDBhNzYwZDhiN2MxMWQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
