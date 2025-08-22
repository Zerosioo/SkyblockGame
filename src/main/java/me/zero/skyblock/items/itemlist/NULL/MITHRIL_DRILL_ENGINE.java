package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MITHRIL_DRILL_ENGINE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Mithril-Plated Drill Engine";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MITHRIL_DRILL_ENGINE"; 
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
    public int getPrice() {
        return 45500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDYzNTk0Nzk2NiwKICAicHJvZmlsZUlkIiA6ICIzOWEzOTMzZWE4MjU0OGU3ODQwNzQ1YzBjNGY3MjU2ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJkZW1pbmVjcmFmdGVybG9sIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRhN2Q1NGNhNDVhMzk4YzM2NGNlYmJmZmI1MzkwY2U1ZTAzNDVlMGM3YmM1ZTg2M2FjYWJmNTdkMTM0MmM0YmQiCiAgICB9CiAgfQp9";
    }

}
