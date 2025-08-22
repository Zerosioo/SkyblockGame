package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FLAWLESS_RUBY_GEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Flawless Ruby Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FLAWLESS_RUBY_GEM"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxODA4MzU3MzU0NywKICAicHJvZmlsZUlkIiA6ICJmZDQ3Y2I4YjgzNjQ0YmY3YWIyYmUxODZkYjI1ZmMwZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzkyNmEyNDhmYmJjMDZjZjA2ZTJjOTIwZWNhMWNhYzhhMmM5NjE2NGQzMjYwNDk0YmVkMTQyZDU1MzAyNmNjNiIKICAgIH0KICB9Cn0=";
    }

}
