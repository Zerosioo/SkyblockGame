package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUILDER_KIWI extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Kiwi";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUILDER_KIWI"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MjMzNjg3MzMzMzUsInByb2ZpbGVJZCI6ImFkMWM2Yjk1YTA5ODRmNTE4MWJhOTgyMzY0OTllM2JkIiwicHJvZmlsZU5hbWUiOiJGdXJrYW5iejAwIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kOTMxN2Y0OGUyNTdmZDY4ODc0OTFmN2JhOWUyYWFhNDFjOTFmY2ZkNDQ2MWFlNzcyYTMyZDI3ODM5YzEzIn19fQ==";
    }

}
