package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPOOKY_WATER_ORB extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Spooky Water Orb";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("A terrifying sphere","of extreme","spookiness.")); 
    }

    @Override
    public String getId() {
        return "SPOOKY_WATER_ORB"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1MjY3NTQ5MjU0NCwKICAicHJvZmlsZUlkIiA6ICJhMWU4OThjNWEyNmY0MTYyOTQyYmNmNmM1MzRiMTE5ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0b21keGlpaSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kNzc0ZTVlZjNkOGJjZGU5ZWEyMWMzNGI4NDgyN2QzNDUzMWU2OGYxMTE1MTBmMzM4MzA1NWVjYWE3NGJlYmNjIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
