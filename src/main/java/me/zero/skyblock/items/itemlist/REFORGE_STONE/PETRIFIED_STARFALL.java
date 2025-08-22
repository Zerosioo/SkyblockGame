package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PETRIFIED_STARFALL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Petrified Starfall";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PETRIFIED_STARFALL"; 
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
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 48000;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MjUzNDUzNzEzODksInByb2ZpbGVJZCI6ImMxZWQ5N2Q0ZDE2NzQyYzI5OGI1ODFiZmRiODhhMjFmIiwicHJvZmlsZU5hbWUiOiJ5b2xvX21hdGlzIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kZGRkNTc3MWY1ODFmNmQwNThiNDFlMmM2NDNkMWZjZWViZDFjNGIyNTY4ZjcxOGRjOWVhNzgzOWMzZGQxYmMifX19";
    }

}
