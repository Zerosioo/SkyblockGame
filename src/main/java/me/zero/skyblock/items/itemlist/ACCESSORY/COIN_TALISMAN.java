package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COIN_TALISMAN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Talisman of Coins";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COIN_TALISMAN"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 70;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzNzM2NTc0NywKICAicHJvZmlsZUlkIiA6ICIxZDUyMzNkMzg4NjI0YmFmYjAwZTMxNTBhN2FhM2E4OSIsCiAgInByb2ZpbGVOYW1lIiA6ICIwMDAwMDAwMDAwMDAwMDBKIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM1YTEyZGM3N2U4OTY5ZmI3NzViOTE1OWM5ZDdlMTk5OWVhMzFhNmE2ZTM5YTcyOWI1ZWY4Yzg3NmZjNjNjNmEiCiAgICB9CiAgfQp9";
    }

}
