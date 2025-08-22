package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ETERNAL_FLAME_RING extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Eternal Flame Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ETERNAL_FLAME_RING"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3NjQ4OTA2MDY2OCwKICAicHJvZmlsZUlkIiA6ICI2ZTIyNjYxZmNlMTI0MGE0YWE4OTA0NDA0NTFiYjBiNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJncnZleWFyZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jOTM4NTY1MTg0NWY4YmZlMTg2YzMwZGE4MWJhY2Q2OTcxYWE1MWJlM2I1MDAxZmM0ZWE1Y2YxYWY4ZjIzYzMzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
