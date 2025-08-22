package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLACIAL_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Glacial Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GLACIAL_RING"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNzMyMDMxNDI2OSwKICAicHJvZmlsZUlkIiA6ICIzYmFlMTVhMWU0Zjg0ZTc5OWE3N2QwZDBhZTNlZDc5NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJiYXlyb25fZ2FtZXJfMjU0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ3OWI1OGFlN2YwYTEwZWZiYWViYjRiYWM1NTNiNjY4NjIzY2E5NjRkOGRhOTU5YTFkMzczZmM2ZjA2NjBmZTYiCiAgICB9CiAgfQp9";
    }

}
