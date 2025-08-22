package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LARGE_ENCHANTED_AGRONOMY_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Large Enchanted Agronomy Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LARGE_ENCHANTED_AGRONOMY_SACK"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NTQ2MDY2OSwKICAicHJvZmlsZUlkIiA6ICJiMzMwZWE4OWE3MTY0OWZjYTMwZmI5ZjU5MTQ5ZjNjMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJfX2FicyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xODRkMmZmMWUxNzczNTc1NzRmOWY3MWUxOTM5N2ZmZjNhMjEwYTk0ZTc4YzBkMmE0MzYwY2M1ZGYxZWI4MDdiIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
