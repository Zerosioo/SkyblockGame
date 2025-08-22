package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SANDCASTLE_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Sandcastle Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SANDCASTLE_PERSONALITY"; 
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
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NjMyMzI1Nzg0MjIsInByb2ZpbGVJZCI6ImRkZWQ1NmUxZWY4YjQwZmU4YWQxNjI5MjBmN2FlY2RhIiwicHJvZmlsZU5hbWUiOiJEaXNjb3JkQXBwIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84MDk4YTQ3OThkOWE4YWM1YTEwNzdjMjg2Yzg1ZGNlOThjYmM1MjRiODZjMDAzNTAwY2YwYTA0ZjlkZGZhNSJ9fX0=";
    }

}
