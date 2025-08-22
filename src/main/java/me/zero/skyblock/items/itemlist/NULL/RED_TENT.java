package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_TENT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Red Tent";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RED_TENT"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NDA1NTQ1MiwKICAicHJvZmlsZUlkIiA6ICJkYjQwYmNjNWUzMDE0ZmZjOGVlOWQxNDU5MTcyYjdhNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJhWGUxOCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81Y2JlNGE1ZTcyN2NmM2YyNjhkMTUxN2IzMjBmZjA0NTRhZGMwNzhlZTg3YTFjZjVlYzQ3NDJjZDAyNDc2NzdlIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
