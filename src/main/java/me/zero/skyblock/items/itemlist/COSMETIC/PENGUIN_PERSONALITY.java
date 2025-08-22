package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PENGUIN_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Penguin Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PENGUIN_PERSONALITY"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNjU3ODkxNTIyMiwKICAicHJvZmlsZUlkIiA6ICI2MTI4MTA4MjU5M2Q0OGQ2OWIzMmI3YjlkMzIxMGUxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJPbGROaWNrVGhlUmVhcGVyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E2N2Y1MzNmNjRiNWVkNDk3MGFkYjc5YThhYzMzYzBkNjFjNmQ4MDQzYmM5ZDIyZTcyMTA0NjQ0YTRhNDIxOGIiCiAgICB9CiAgfQp9";
    }

}
