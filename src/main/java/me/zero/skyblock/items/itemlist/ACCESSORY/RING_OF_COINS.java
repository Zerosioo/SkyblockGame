package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RING_OF_COINS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ring of Coins";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RING_OF_COINS"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1MjkwNjM2NSwKICAicHJvZmlsZUlkIiA6ICI0NWRjNjlmYTIzNjE0OTdkYTQ3ZTI3MTg0ZGE2ZDlkMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOZXNzeTE3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQxYTNlN2M3Njk5YmY4Mzc4ZjU4MmMxZDNlYjlhZjA2OGI4NWRiMjM1YmE3OGViYjI1M2EwNGFmM2VjNTY1YTMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
