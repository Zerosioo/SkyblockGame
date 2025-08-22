package me.zero.skyblock.items.itemlist.COSMETIC;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HAM_BARN_SKIN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ham Barn Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HAM_BARN_SKIN"; 
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
        return ItemType.COSMETIC;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMjg1MTI2MzE5MiwKICAicHJvZmlsZUlkIiA6ICJmZDlhMmNhNGNhMWM0YTkwYWEyODkyNThkYmM3MmFiNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJJRnJhbmtvWCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kMDlkYWNkOTIwN2ZhMzBiMWE5MGUxYTA0YzY3YmQ4OGNlYmNiZGQ0M2IxMDdmYjFmYTI5MjkzMmU0NDg1MWNjIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
