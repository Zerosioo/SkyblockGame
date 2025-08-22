package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HANGING_REAPER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hanging Reaper";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HANGING_REAPER"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NjQzMjEwMDg1NywKICAicHJvZmlsZUlkIiA6ICI4ODBiZWMwYTE0MmM0YzRlYTJlZjliMTFiMTBkNWNiNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJmZ2FiIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzk5MzM0ODUzMzVmYzljMzhhYjMyZTZiZDJjZDQ4MGMzYmFmNjFiMGUzZjZiY2E2MWUwZTNjZjFmNzc0N2M5ZGEiCiAgICB9CiAgfQp9";
    }

}
