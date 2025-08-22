package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class METEOR_SHARD extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Meteor Shard";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "METEOR_SHARD"; 
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
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 41150;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0ODQ3Mzc1OTk4NiwKICAicHJvZmlsZUlkIiA6ICJkNDg1NWJhYWMzYjM0Mjk1YWJmYjBlZjFiYWIyYzBkOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUb21pYXRhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZmMzc5MjEyZjQyMDYwYWUwNTYzYzcwNzM5YTdlYzQyYWQ0OGU3MGY3NDIxMGIyOTBkMjMwN2E0Nzg0NWVjMmMiCiAgICB9CiAgfQp9";
    }

}
