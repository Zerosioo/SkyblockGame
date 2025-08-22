package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FRIGID_HUSK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Frigid Husk";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FRIGID_HUSK"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwOTMzMjcyMDc0OCwKICAicHJvZmlsZUlkIiA6ICI4YjA2ZmU5ZGNjNjg0NDNmYWNmM2QzODA0NWNkNTMyNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDYXN0aWVsY3ZyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgzODIxODJlZjA3NjA3MDg4MmVlMGIzYjhmNmRjZmFlMTIzNGFmMmE1ZDIyMDhiYThhMDE2NTg5ZDY1MTg5ZWIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
