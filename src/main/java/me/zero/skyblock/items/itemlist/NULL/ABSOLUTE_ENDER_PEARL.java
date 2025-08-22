package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ABSOLUTE_ENDER_PEARL extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Absolute Ender Pearl";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ABSOLUTE_ENDER_PEARL"; 
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
    public int getPrice() {
        return 11200;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MjE0NjQ4ODk4NiwKICAicHJvZmlsZUlkIiA6ICI0M2NmNWJkNjUyMDM0YzU5ODVjMDIwYWI3NDE0OGQxYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJrYW1pbDQ0NSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82N2Q5ZmUwNjUwMjRmZmY0YjM0Yzc4ZjkyY2QzMTUwZDZiZGZhYWI3YzM3NWEwZWU3ODUwNzZlMWE0YTI1NGU5IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
