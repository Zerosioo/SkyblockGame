package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REAPER_ORB extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Reaper Orb";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REAPER_ORB"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxODYwNjE0ODU2NiwKICAicHJvZmlsZUlkIiA6ICJjMGYzYjI3YTUwMDE0YzVhYjIxZDc5ZGRlMTAxZGZlMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJDVUNGTDEzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzNhN2NkYTkwMDRmYzE5N2Q2NmFmYmMyYjAwM2E1YjllZjEzY2Y0NjAwYjFmYzc0OTAwNjc1OTBmMDQ3MTgxZSIKICAgIH0KICB9Cn0=";
    }

}
