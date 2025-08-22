package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAWLESS_AMBER_GEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Flawless Amber Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAWLESS_AMBER_GEM"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxODA4NTE3NjQ5NiwKICAicHJvZmlsZUlkIiA6ICJiNWRkZTVmODJlYjM0OTkzYmMwN2Q0MGFiNWY2ODYyMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJsdXhlbWFuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzlkY2U2MmY3MGFjMDQ2Yjg4MTExM2M2Y2Y4NjI5ODc3Mjc3NzRlMjY1ODg1NTAxYzlhMjQ1YjE4MGRiMDhjMGQiCiAgICB9CiAgfQp9";
    }

}
