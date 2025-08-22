package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FANCY_FLOWER_POT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Flower Pot";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FANCY_FLOWER_POT"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzcwODE3NywKICAicHJvZmlsZUlkIiA6ICI2Mjk5YzhlYzkxM2I0MzMyYjZiMDJhOTFmNDk2MzJhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJIaW5hTGluayIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81YjQ2M2JjYzQ3NDE5MzAyZjIzMmM3ODAxOWU0MmEzMGQ1MDliMjI5NjZkMDU0ZjUxNGI3NmZlZWQxNTJkNDNlIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
