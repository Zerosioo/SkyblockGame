package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TOTEM extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Totem";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TOTEM"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4OTU0MzQ4MzM3MSwKICAicHJvZmlsZUlkIiA6ICJkN2Y4OTAyMWMxNmQ0ZjFhODg3ODQyNDQyZjc3NGI0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJQYW5kYXRvSG9wZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80ZDM1OWRhNGY3MGYxYmNiZTgxNTQ1ZmMzYTk3YjY1YzFkNzBmM2Y5MDE5OGQ3NTc4NDVhYWIxOThiNmUwMDU5IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
