package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MASTIFF_PUPPY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Puppy Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MASTIFF_PUPPY"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NjUyMTg2MzkxOCwKICAicHJvZmlsZUlkIiA6ICJiZTQxNTM0NTFiYjQ0MmQ5ODMwNzRhYjRmNDhmMWY5NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJpdHNsZW1vbmNvbGFfIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2YyMmY2N2U1ZmU1YmFkYjNhMGMyMzE4NjBkMmI2ODY4MmNlZDRhZmU5MmY4ZDFhZGY4MjJjZTljZDRiMGE3NDAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
