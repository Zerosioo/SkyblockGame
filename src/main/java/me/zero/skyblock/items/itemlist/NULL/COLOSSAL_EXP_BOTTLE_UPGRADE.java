package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COLOSSAL_EXP_BOTTLE_UPGRADE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Colossal Experience Bottle Upgrade";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COLOSSAL_EXP_BOTTLE_UPGRADE"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1ODcwMTkzMzQ1NTcsInByb2ZpbGVJZCI6IjIzZjFhNTlmNDY5YjQzZGRiZGI1MzdiZmVjMTA0NzFmIiwicHJvZmlsZU5hbWUiOiIyODA3Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83MDU0YzI5Yzc4MDkwNDcxYzFlYTA1OGJkNjQxODk3MzkxYzllNDY5NGFhOWQxNDBhZmJiYThkMGNjNDM2MzcifX19";
    }

}
