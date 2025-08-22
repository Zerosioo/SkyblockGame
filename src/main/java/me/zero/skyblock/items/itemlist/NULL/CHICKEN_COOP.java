package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHICKEN_COOP extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Chicken Coop";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHICKEN_COOP"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzE0MDA2OCwKICAicHJvZmlsZUlkIiA6ICI0NWRjNjlmYTIzNjE0OTdkYTQ3ZTI3MTg0ZGE2ZDlkMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOZXNzeTE3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2YwNGMxNTNjMGE2ZTI1NWFkZjYyZWE4ZjhjMGQ0Y2UxZjk2ODk3NDM5MGJjZWZjNTJjMTMxMmMyMzk1ZjNmMDkiCiAgICB9CiAgfQp9";
    }

}
