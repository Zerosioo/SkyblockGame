package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SKULL_PERSONALITY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Skull Minion Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SKULL_PERSONALITY"; 
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
        return "eyJ0aW1lc3RhbXAiOjE1NjgzNDU4ODM2OTUsInByb2ZpbGVJZCI6IjQ0MDNkYzU0NzViYzRiMTVhNTQ4Y2ZkYTZiMGViN2Q5IiwicHJvZmlsZU5hbWUiOiJHR0dhbWVyc1lUIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82ZjJlNzc2NzU3MDY0MzgyZDI4YTUxOGI4OGQ5OGJkNDhjNjZhMTQxNjhiNTdlNmI2NTc2ZWZlMzAwMTQxMTFhIiwibWV0YWRhdGEiOnsibW9kZWwiOiJzbGltIn19fX0=";
    }

}
