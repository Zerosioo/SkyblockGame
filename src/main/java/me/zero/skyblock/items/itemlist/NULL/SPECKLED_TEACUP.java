package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPECKLED_TEACUP extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Speckled Teacup";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SPECKLED_TEACUP"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public int getPrice() {
        return 100000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczNjg5MTUyOTk5MCwKICAicHJvZmlsZUlkIiA6ICI1ZjU5NmViY2JlOTQ0NmQxYmI0M2JlNGYzZjRiOGJlNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUZWlsMHNzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM1OTA4ZWNmNGVkM2FiNjNmYmExZWNlZGUwM2Q3YTBkZDU4YjUzYWMyZTIwNjgxMjU1MjE5NjA5ZjJkYWM5NGIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
