package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GHAST_HEAD extends SItem implements ItemStatistics, SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Ghast Head";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GHAST_HEAD"; 
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
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 64;
    }

    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NTc0NzQyNzc5NzMsInByb2ZpbGVJZCI6IjJjMTA2NGZjZDkxNzQyODI4NGUzYmY3ZmFhN2UzZTFhIiwicHJvZmlsZU5hbWUiOiJOYWVtZSIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E4YjcxNGQzMmQ3ZjZjZjhiMzdlMjIxYjc1OGI5YzU5OWZmNzY2NjdjN2NkNDViYmM0OWM1ZWYxOTg1ODY0NiJ9fX0=";
    }

}
