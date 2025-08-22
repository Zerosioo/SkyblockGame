package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WEDDING_RING_7 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Exquisite Ring of Love";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WEDDING_RING_7"; 
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
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzOTg5NjUyMywKICAicHJvZmlsZUlkIiA6ICJiZWNkZGIyOGEyYzg0OWI0YTliMDkyMmE1ODA1MTQyMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdFR2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzhmYjI2NWM4Y2M2MTM2MDYzYjRlYjE1NDUwZmUxZmUxYWI3NzM4YjBiZjU0ZDI2NTQ5MGUxZWY0OWRhNjBiN2MiCiAgICB9CiAgfQp9";
    }

}
