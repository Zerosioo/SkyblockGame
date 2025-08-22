package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FORAGING_2_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to Spruce Woods";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FORAGING_2_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTc5ODAyNTU4ODcsInByb2ZpbGVJZCI6IjBiZTU2MmUxNzIyODQ3YmQ5MDY3MWYxNzNjNjA5NmNhIiwicHJvZmlsZU5hbWUiOiJ4Y29vbHgzIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85NjZjYmRlZjhlZmI5MTRkNDNhMjEzYmU2NmI1Mzk2Zjc1ZTVjMWI5MTI0Zjc2ZjY3ZDdjZDMyNTI1NzQ4In19fQ==";
    }

}
