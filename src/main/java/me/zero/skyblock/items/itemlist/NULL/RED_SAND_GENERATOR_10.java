package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_SAND_GENERATOR_10 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Red Sand Minion X";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RED_SAND_GENERATOR_10"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODk2MzM3NzE4MSwKICAicHJvZmlsZUlkIiA6ICI0Mzk0NGU5NWZiNjI0NmJiOGIyYmQ5NDZlNWY5YjhhMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJCbGFja0NvdWxkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RiZjcwNjBjYTZmNDEwNzZmZmJiODY5YjdjMDViMzg2ZjI5NjgyMGVmN2FlY2QwZjkwOGYxMjBiODMxN2EwNzciCiAgICB9CiAgfQp9";
    }

}
