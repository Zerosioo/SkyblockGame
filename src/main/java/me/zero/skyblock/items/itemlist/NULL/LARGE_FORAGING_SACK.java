package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LARGE_FORAGING_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Large Foraging Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LARGE_FORAGING_SACK"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NTI4Mzc4NywKICAicHJvZmlsZUlkIiA6ICIzZGE2ZDgxOTI5MTY0MTNlODhlNzg2MjQ3NzA4YjkzZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGZXJTdGlsZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yYzZlMjRkZjQ5OGJhNGE1ODljMjU5ZDlmYzBkM2RiMzQ4ZjkzY2RmMjZhNWZlNDYxNTcxYzFkYTcwNmVmYWYzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
