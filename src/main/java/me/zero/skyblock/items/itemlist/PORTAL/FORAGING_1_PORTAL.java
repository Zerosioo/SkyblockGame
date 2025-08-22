package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FORAGING_1_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to Birch Park";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FORAGING_1_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTc5ODAwMTc2NjQsInByb2ZpbGVJZCI6IjQzYTgzNzNkNjQyOTQ1MTBhOWFhYjMwZjViM2NlYmIzIiwicHJvZmlsZU5hbWUiOiJTa3VsbENsaWVudFNraW42Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hMjIxZjgxM2RhY2VlMGZlZjhjNTlmNzY4OTRkYmIyNjQxNTQ3OGQ5ZGRmYzQ0YzJlNzA4YTZkM2I3NTQ5YiJ9fX0=";
    }

}
