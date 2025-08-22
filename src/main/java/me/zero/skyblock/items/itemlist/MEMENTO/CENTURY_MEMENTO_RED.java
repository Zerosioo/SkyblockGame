package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CENTURY_MEMENTO_RED extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Cake Slice of the Century";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Taste of red velvet.")); 
    }

    @Override
    public String getId() {
        return "CENTURY_MEMENTO_RED"; 
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
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MzQzMTQyNjg1NywKICAicHJvZmlsZUlkIiA6ICJiMDU4MTFjYTdmNDk0YTM5OTZiNDU4ZjcwMmQ2MzJiOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJVeWlsIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2FjNWQxZWUyZjhiNTNhMDc5NDM2ZDk0ZDE3ZDBkMDhlZjU1NjNiY2JlZmRiYThlMmE0NTYxOTkzNjdjMTBmYjAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
