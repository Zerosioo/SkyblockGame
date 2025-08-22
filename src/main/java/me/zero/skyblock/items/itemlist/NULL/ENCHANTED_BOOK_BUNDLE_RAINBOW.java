package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_BOOK_BUNDLE_RAINBOW extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Enchanted Book Bundle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_BOOK_BUNDLE_RAINBOW"; 
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
        return Rarity.UNCOMMON;
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
    public int getPrice() {
        return 10000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MDg3ODY1MCwKICAicHJvZmlsZUlkIiA6ICIyMWNjMzkxZmNkMjc0NzY5OTg5Y2M3M2VjYWRiNTE3YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHT1NUTFk5NyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lNWQ3MjdiNjljYTBmMGIxNmY2NTUwNDdlNDhmYjJiNGRmMTBhYTY0MDY1MTE4Mjc0ZDRmOWY4YzViMDU0NDk2IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
