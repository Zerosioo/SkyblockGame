package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAXOR_THE_FISH extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Maxor the Fish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAXOR_THE_FISH"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE0ODEwNDc1OTIxMzAsInByb2ZpbGVJZCI6IjM5YWY2ODQ0NjgwOTRkMmY4YmE0N2U5MmQwODdiZTE4IiwicHJvZmlsZU5hbWUiOiJNSEZfV2l0aGVyIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jZGY3NGUzMjNlZDQxNDM2OTY1ZjVjNTdkZGYyODE1ZDUzMzJmZTk5OWU2OGZiYjlkNmNmNWM4YmQ0MTM5ZiJ9fX0=";
    }

}
