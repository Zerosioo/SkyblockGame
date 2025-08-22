package me.zero.skyblock.items.itemlist.BAIT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLESSED_BAIT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Blessed Bait";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLESSED_BAIT"; 
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
        return ItemType.BAIT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 42;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MzE5MDMzNTc4NzUsInByb2ZpbGVJZCI6IjkxOGEwMjk1NTlkZDRjZTZiMTZmN2E1ZDUzZWZiNDEyIiwicHJvZmlsZU5hbWUiOiJCZWV2ZWxvcGVyIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jMmI5MTBiNTg5N2NkYjg2YjIxZWJmY2JhNTQ0YWZhNDcwYWU2ZDIyOGJlZTM0OTQ0MjdjOWM3ZThmMzM1MDJiIn19fQ==";
    }

}
