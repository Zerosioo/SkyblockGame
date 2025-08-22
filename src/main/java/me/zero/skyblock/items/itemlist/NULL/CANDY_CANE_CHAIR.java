package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CANDY_CANE_CHAIR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Candy Cane Chair";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CANDY_CANE_CHAIR"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMDMwNjY1MzQ1MywKICAicHJvZmlsZUlkIiA6ICI3OThlZWM3OGYzNGU0MGJhYjlmNjk0ODIwYzM3ZTcxYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJFbENoYW5vbk1DIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2YwNDZlZmJkYTk2MjYwNDQxNjU5MWQxMGJkMTRiM2M3NTc5N2IwYTc3YzUwYjhiNzg0MmFiNDA2ZDQ5OWI1MDQiCiAgICB9CiAgfQp9";
    }

}
