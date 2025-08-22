package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FERMENTO_ARTIFACT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Fermento Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FERMENTO_ARTIFACT"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3ODgyMjE4OTc2MCwKICAicHJvZmlsZUlkIiA6ICJmMTkyZGU3MDUzMTQ0ODcxOTAwMjQ1MmIzZWE3MzA3NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJOZVhvU2V0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2UxYWRkNzIzMWM5N2U3N2ExNjliZTc2NGE0MWY5ODFjYzlmNTQyYWE4YzZhMTMzNmQ4YmUyZDgxNzIxMWJiZmQiCiAgICB9CiAgfQp9";
    }

}
