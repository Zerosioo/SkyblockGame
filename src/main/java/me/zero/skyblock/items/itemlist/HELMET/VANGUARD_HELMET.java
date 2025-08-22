package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VANGUARD_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Vanguard Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VANGUARD_HELMET"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMDQzNTc1NzQ0NCwKICAicHJvZmlsZUlkIiA6ICJlNzhjY2YyNjMxZTY0MjJkOGY1YzE3ZTliZGQ3N2RjOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJEQU5JRUwxOTB5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzliYjg2ODdlNzNjODRlMzEwZDFiYzAyMzFiODQyZGFkMWY5MzAwMWI2ZDliYTMzMjllM2M4YTY4NWI1MzU2MjMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
