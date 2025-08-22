package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PULPOUS_ORANGE_JUICE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pulpous Orange Juice";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PULPOUS_ORANGE_JUICE"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTUyNDY4NTY2MDgsInByb2ZpbGVJZCI6IjQzYTgzNzNkNjQyOTQ1MTBhOWFhYjMwZjViM2NlYmIzIiwicHJvZmlsZU5hbWUiOiJTa3VsbENsaWVudFNraW42Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82MWIzNWY3MDc3ZWNmOThlZjNlYmEwZjM1ZDkzYTk4MTMwMzBmOWI4YjhlNDI2YWViNjhkYWIzOGYxMTE2In19fQ==";
    }

}
