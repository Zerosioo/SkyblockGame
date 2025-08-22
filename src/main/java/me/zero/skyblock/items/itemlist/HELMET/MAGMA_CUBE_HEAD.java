package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGMA_CUBE_HEAD extends SItem implements ItemStatistics, SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Magma Cube Head";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGMA_CUBE_HEAD"; 
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
        return ItemType.HELMET;
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
    public int getPrice() {
        return 32;
    }

    @Override
    public int getHealth() {
        return 25;
    }

    @Override
    public int getDefense() {
        return 25;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE0OTk3MTAwODQ4OTEsInByb2ZpbGVJZCI6IjA5NzJiZGQxNGI4NjQ5ZmI5ZWNjYTM1M2Y4NDkxYTUxIiwicHJvZmlsZU5hbWUiOiJNSEZfTGF2YVNsaW1lIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zODk1N2Q1MDIzYzkzN2M0YzQxYWEyNDEyZDQzNDEwYmRhMjNjZjc5YTlmNmFiMzZiNzZmZWYyZDdjNDI5In19fQ==";
    }

}
