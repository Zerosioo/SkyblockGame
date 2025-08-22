package me.zero.skyblock.items.itemlist.BELT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VERMIN_BELT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Vermin Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VERMIN_BELT"; 
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
        return ItemType.BELT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MjA4NDU2MTY0NCwKICAicHJvZmlsZUlkIiA6ICJhODUxNzQ0MDNlNjg0MDgwYWNkODU3MzhlMjI5NGNhZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJEYVJpdmVyc09uZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xNTIzMDVlMzA0ZTAzMTkxMWI4Y2QxZWRlMDZmNThmMjQ3YjMzYmFkMzFmYTFhOWIzZGQ5ZjZkMmQ4NDVlODA3IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
