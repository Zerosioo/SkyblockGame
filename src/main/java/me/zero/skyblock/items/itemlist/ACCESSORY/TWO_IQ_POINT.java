package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TWO_IQ_POINT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "2 IQ Points";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TWO_IQ_POINT"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyNzU4OTI2OTUwMywKICAicHJvZmlsZUlkIiA6ICJmZjQ3NzI5YmQwZDI0YWYwOThiMTFjMGE3ZTFiMGVlZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYXRzY2FuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE1MWM1MzQ3MTllNmY4OTM3ZTJjOWM0NWM2MDFjZDVhZTdlMDZmZmQ3ZjQ0NjM2NTljMDQzMTc5MDI5NTA0ZWEiCiAgICB9CiAgfQp9";
    }

}
