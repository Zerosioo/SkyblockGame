package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TOPAZ_CRYSTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Topaz Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TOPAZ_CRYSTAL"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMDA3NjQyNzU5NCwKICAicHJvZmlsZUlkIiA6ICIyM2YxYTU5ZjQ2OWI0M2RkYmRiNTM3YmZlYzEwNDcxZiIsCiAgInByb2ZpbGVOYW1lIiA6ICIyODA3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ0OWE2ZDMzMDQ2NWJjOTRkNTczNzE2NDI4ZGM2NjJjYzE2YWNkM2I4MDUzNWI1MjAyOGM2NjVmNGRhZjY4MmUiCiAgICB9CiAgfQp9";
    }

}
