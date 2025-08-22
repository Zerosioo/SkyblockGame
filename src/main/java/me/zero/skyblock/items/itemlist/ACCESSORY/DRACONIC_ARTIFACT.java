package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DRACONIC_ARTIFACT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Draconic Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DRACONIC_ARTIFACT"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyODYzMDI4NzY5MywKICAicHJvZmlsZUlkIiA6ICJkYmNlZjMyZjI5ZDc0Y2UzOTUzOWMwYjBhMTE1YjZiZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJyYW1waXJlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2VhZDdkY2JlOTM0MDFiM2QzYjRlNTIyMmVmODA5N2FlZjQ0MzFmNDgwNjRkMGEwNTMxZmEwOTUyYzIxMWUwZTYiCiAgICB9CiAgfQp9";
    }

}
