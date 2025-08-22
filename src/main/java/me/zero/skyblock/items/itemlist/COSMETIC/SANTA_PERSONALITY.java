package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SANTA_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Santa Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SANTA_PERSONALITY"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU4ODY5MDY3Nzc3OSwKICAicHJvZmlsZUlkIiA6ICIwYjBiNGI0NWIxMmQ0ZTQ2OGRkMDc0OWU3ZGQyMTkwZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ4TWFyc2hoXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kMTc4YWUwM2Q4NDIyN2YyMWZhMjM2ODJkOWM2MjAxMzEwMDBmZmI3NjczMzk1NTMzYjI3NDBmYTgzYWIxMDM3IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
