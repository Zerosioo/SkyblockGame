package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VOLLEYBALL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Volleyball Court";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VOLLEYBALL"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1ODY2MTc1MzM5ODcsInByb2ZpbGVJZCI6ImRkZWQ1NmUxZWY4YjQwZmU4YWQxNjI5MjBmN2FlY2RhIiwicHJvZmlsZU5hbWUiOiJEaXNjb3JkQXBwIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kNjFkYzRiOGE2ZDMxN2U3MjM5OTdlZTI4MGU1MjhkNmIzNWM2YWQ5NzljYjI4ODk3ZmU3ZGRkNmIxYmQzYTgwIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=";
    }

}
