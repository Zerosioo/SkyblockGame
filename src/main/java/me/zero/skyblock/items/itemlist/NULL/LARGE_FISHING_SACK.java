package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LARGE_FISHING_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Large Fishing Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LARGE_FISHING_SACK"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NTMwMDAyNCwKICAicHJvZmlsZUlkIiA6ICJlMDc4ODcyZDhmMmM0ODQ1ODlhODg1YjdiZWJmMzA5YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUb21pZnRtYyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mOGY2ODY2OTM1MWE2ZmM3MTU2ZWNmZTMzMDBiYTk0ZWZlMDc2NmUyNGJlZDg3ODVjZjY0YTlmOTU0MzUxMzRiIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
