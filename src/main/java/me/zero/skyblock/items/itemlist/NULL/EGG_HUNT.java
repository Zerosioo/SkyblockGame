package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EGG_HUNT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Egg Hunt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EGG_HUNT"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNjM2NzQ2MzcwOSwKICAicHJvZmlsZUlkIiA6ICJjMWE3ZjlkZjgyYTU0NjZmOGQ2YjdkYTk3OTA4NGY0OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSYW1tbyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85OGM1NTMwYzJjODU2ZTMwYjExZmIyMmM3MTExMTdiMDczZmQ4MzMzYWUwNmM5ZmQxYzY5N2M0YWY0YTBjY2M5IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
