package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Y extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Y";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oTwo Dimensional")); 
    }

    @Override
    public String getId() {
        return "Y"; 
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
    public int getPrice() {
        return 30;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MzYxMDc4OTU0MiwKICAicHJvZmlsZUlkIiA6ICIzNzNiZmY5NzQwMmY0N2IzOTViOTZlNzc3NmNmOGFhMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJjdXRlcGluazczIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2YwMmI3NTRmMWY3MmFhNjU1MWMwMjA0YTAwMWZlNTM2MjcwN2UzMDJjZjAzNzk5NzFmMjZjYjVkYWRhNTY0YjYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
