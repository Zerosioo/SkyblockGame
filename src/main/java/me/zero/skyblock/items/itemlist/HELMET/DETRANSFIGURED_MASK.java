package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DETRANSFIGURED_MASK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Used Detransfigured Face";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DETRANSFIGURED_MASK"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3ODcxMTcxODc5MCwKICAicHJvZmlsZUlkIiA6ICI3ZDJhY2YzOGQ3YTQ0YjU0YTliMGNkYTZhNzk1YmNmYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJCb3VuY2luZXNzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFiNmJiOGVjNjMyNTYyYjUxMzMwMGNiOTQxM2Q3Zjc5NzQ2NzFlNjdhYWFmMjBkZWQxZjM3ZDhjMWM1MGI4OGIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
