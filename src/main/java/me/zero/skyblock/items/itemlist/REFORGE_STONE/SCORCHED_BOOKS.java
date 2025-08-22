package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCORCHED_BOOKS extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Scorched Books";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SCORCHED_BOOKS"; 
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
        return Rarity.MYTHIC;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MDAyODQxNjk4MSwKICAicHJvZmlsZUlkIiA6ICIzNmMxODk4ZjlhZGE0NjZlYjk0ZDFmZWFmMjQ0MTkxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJMdW5haWFuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ2ZWU3ZTkwNjY4NmFiZDVlYzE5MmIwNzkzMTRjNDVmMWZiODE3MWQ5ZTEzY2FhNGNmOWY2M2FmYzIyNjNmZDUiCiAgICB9CiAgfQp9";
    }

}
