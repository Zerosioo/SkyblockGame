package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CENTURY_MEMENTO_GREEN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Cake Slice of the Century";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Taste of matcha.")); 
    }

    @Override
    public String getId() {
        return "CENTURY_MEMENTO_GREEN"; 
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
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5MzQzMTUxMzU3OCwKICAicHJvZmlsZUlkIiA6ICI4MTYyODhjZGZkZTg0YTIyOGRhMTBlNTI0MzA3MzQwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJSeXVKYWNoYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lOTU3MjhhMDVhY2U1NGVhMjdiZDQ2N2ZiNzEzMGYwMmZmMzk3YTI5MzY4Mjg0NjhhZWY4MDZjZGVlZmZkNGE1IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
