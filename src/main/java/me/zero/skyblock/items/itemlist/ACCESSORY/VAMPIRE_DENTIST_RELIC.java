package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VAMPIRE_DENTIST_RELIC extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Vampire Dentist Relic";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VAMPIRE_DENTIST_RELIC"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 80000;
    }

    @Override
    public int getHealthRegeneration() {
        return 10;
    }

    @Override
    public int getVitality() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2NTU0NTY1NDAyNywKICAicHJvZmlsZUlkIiA6ICJiYzRlZGZiNWYzNmM0OGE3YWM5ZjFhMzlkYzIzZjRmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICI4YWNhNjgwYjIyNDYxMzQwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzlkMDZkOWEwNGE1YTc3MjA2MTRlOTM0Yzc1YzZiNjUxZjBlYmFiZWEzYTc0NjFmMWM3NDEwNWM3YTJhMGU2NzIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
