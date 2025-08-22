package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_BOOK_BUNDLE_VICIOUS extends SItem implements ItemStatistics, SkullItem {

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
        return "ENCHANTED_BOOK_BUNDLE_VICIOUS"; 
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
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MTgyODY2OTMxNDAsInByb2ZpbGVJZCI6ImUzYjQ0NWM4NDdmNTQ4ZmI4YzhmYTNmMWY3ZWZiYThlIiwicHJvZmlsZU5hbWUiOiJNaW5pRGlnZ2VyVGVzdCIsInNpZ25hdHVyZVJlcXVpcmVkIjp0cnVlLCJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzI2MWJmNWM3ZmZhMjU0YzE4Mjg0NDgwMzIxMTVlNWNjMTU0NDM2ZGVjMDk5OGM0ZDdhYmQ5OTZhZTFkOTI3In19fQ==";
    }

}
