package me.zero.skyblock.items.itemlist.NONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLACIAL_FRAGMENT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Glacial Fragment";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A small piece of a","giant glacier.","Doesn't ever melt.")); 
    }

    @Override
    public String getId() {
        return "GLACIAL_FRAGMENT"; 
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
        return ItemType.NONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 200;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5OTk5OTEyODg1NSwKICAicHJvZmlsZUlkIiA6ICJmMTYwZTMxMzJjYWM0YjRiOWM5OTk2NDQ1OGIxOWM0ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGYWNrX1JvbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hMTIyNDA4NjYyYWY1YjFhZGY3YWQ1OTIxMTMyODJjMzRmNzcxNDE4ZWVlZWQ0ZmY5MmVhMTgxNDBmOTkxYzFkIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
