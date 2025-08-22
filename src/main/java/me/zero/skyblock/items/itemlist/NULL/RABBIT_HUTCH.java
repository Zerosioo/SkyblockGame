package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RABBIT_HUTCH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Rabbit Hutch";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RABBIT_HUTCH"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzMyMjIxNywKICAicHJvZmlsZUlkIiA6ICI2NWUxN2M2Njk5NDU0ODQxYTdhNjc4ZWY2YzBhNGY1ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJPbGRSZWRUViIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mYmJlNWVjNmY3M2Y2MmJlOTg0YjBkYjExYjRhY2NjOTI5ZWM3ZjFjNzIyMmUzOWQwNTEwOWE1YTZlYWIxZGFmIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
