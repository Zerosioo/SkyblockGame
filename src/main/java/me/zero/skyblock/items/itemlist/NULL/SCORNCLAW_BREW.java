package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCORNCLAW_BREW extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Scornclaw Brew";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SCORNCLAW_BREW"; 
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
 	return null;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE0OTQ3NjcxNzY4MTYsInByb2ZpbGVJZCI6IjQzYTgzNzNkNjQyOTQ1MTBhOWFhYjMwZjViM2NlYmIzIiwicHJvZmlsZU5hbWUiOiJTa3VsbENsaWVudFNraW42Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jYzZiNGE3YmQ4MjQ0MTYxOWJiYzExZDliOGUwZTY0YWU4Yjk1ZjJlNDBiMzkyMTM1NWZjYzU0MzQzMjYwMTcifX19";
    }

}
