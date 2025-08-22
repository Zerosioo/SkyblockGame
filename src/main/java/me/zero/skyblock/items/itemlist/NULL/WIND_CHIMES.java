package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WIND_CHIMES extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Wind Chimes";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WIND_CHIMES"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4ODQyNDQ2ODQ0NSwKICAicHJvZmlsZUlkIiA6ICJiNzQ4YWExODk3ZGU0Y2RiYjFhNTI1YjVjMjM3ZDc2MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaXhpOCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yOWYyOWZmYTRjNWIxNTgyYzIxYWVmNTNlNDA2YjRlNDY2YWUxNDZiMDdkMjliYTMwZGU0NTU3MTZmYjllNzQzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
