package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARGOFAY_TRINKET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Argofay Trinket";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARGOFAY_TRINKET"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNTUxMjIwNzg5MSwKICAicHJvZmlsZUlkIiA6ICJmYzUwMjkzYTVkMGI0NzViYWYwNDJhNzIwMWJhMzBkMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDE3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzg3NjFlMjM2ZDg2MWRiNGM4YzZhYzA3ODM4MDdkZDE5ZDQ0MGI1MGEyMDNkMWFiNzBmZjE4N2M2MWQ0YTUxNTgiCiAgICB9CiAgfQp9";
    }

}
