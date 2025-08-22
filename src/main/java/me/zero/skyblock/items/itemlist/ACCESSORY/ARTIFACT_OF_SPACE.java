package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARTIFACT_OF_SPACE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Artifact of Space";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARTIFACT_OF_SPACE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3MjQ4MjI5ODY4MSwKICAicHJvZmlsZUlkIiA6ICI3ZDJhY2YzOGQ3YTQ0YjU0YTliMGNkYTZhNzk1YmNmYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJCb3VuY2luZXNzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y2MTYzODgwMGI4ZjJjZWFmY2FlZGVkYjFlYTAyZmJkOWVjNGQxMWE4MGQ4YzI2ZDAwY2JjOThjMDNmM2RiNzkiCiAgICB9CiAgfQp9";
    }

}
