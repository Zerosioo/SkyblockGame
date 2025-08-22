package me.zero.skyblock.items.itemlist.BAIT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DARK_BAIT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Dark Bait";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DARK_BAIT"; 
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
        return ItemType.BAIT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 8;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNzUxMjI4MDU5NCwKICAicHJvZmlsZUlkIiA6ICI5MWYwNGZlOTBmMzY0M2I1OGYyMGUzMzc1Zjg2ZDM5ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdG9ybVN0b3JteSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83MjgxNjE4YTVjODIzOTA3OGZkNDNmZWY4ZWFlMTRlYTAwNjY1ZjYzNWJkNTZkNDQ1MWNjY2Q1ZDBmYTExODIxIgogICAgfQogIH0KfQ==";
    }

}
