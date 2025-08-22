package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GIFTBAG_OF_THE_CENTURY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Gift Bag of the Century";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GIFTBAG_OF_THE_CENTURY"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczNjE4Mzc1NzQ1NSwKICAicHJvZmlsZUlkIiA6ICJiODU0NWMxMDlhZjE0ZGRjYmY4ZjhmZjg4ZTU2NzI4OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJQdGFrb3B5c2tDWiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kMWMzZTg3ZjMwMjkwMDQ1ZDAxOTUwNmM4MDU4MzRiYTk3MWY1YWVlYzBkN2QwNTA1MjYxZjMxNGE1NDY1NjM4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
