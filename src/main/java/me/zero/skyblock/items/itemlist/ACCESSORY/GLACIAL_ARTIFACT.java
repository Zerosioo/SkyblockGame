package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLACIAL_ARTIFACT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Glacial Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GLACIAL_ARTIFACT"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjMwMjAzMiwKICAicHJvZmlsZUlkIiA6ICI0OTY5YTVlZTYxMTY0MDBkYTM4YzhmZjRiMWJhZTZiZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFjdFpJUCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mMmFlNjAyOGE3NTQ0MWE1ZDNmNzE4ZTU3NGZiOWFjN2MzMTBkNGQ3ZGM5N2JhNTZiYTNkMjc4ZDc5ZTdlYzIzIgogICAgfQogIH0KfQ==";
    }

}
