package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUNDLED_SNOWMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bundled Snowman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUNDLED_SNOWMAN"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1NjE2OTQ2NTM5ODgsInByb2ZpbGVJZCI6IjAyNzgyOWZlNTg3YjQ4YTY5M2UzOGQxZmI3MDBjMWI1IiwicHJvZmlsZU5hbWUiOiJTbm93TWFuNjkwIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lMGQ2YWYxNWEwZjNjMzBkN2U3MWMxOTQxYzMzNzQzMGZjMDk1NDM3YTY2MjQ1MDlkOTY1Njk3YWViMjZmYTA4In19fQ==";
    }

}
