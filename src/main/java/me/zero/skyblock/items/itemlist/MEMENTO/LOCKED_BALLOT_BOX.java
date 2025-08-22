package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LOCKED_BALLOT_BOX extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Locked Ballot Box";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LOCKED_BALLOT_BOX"; 
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
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMzY2NTYzNDgwOSwKICAicHJvZmlsZUlkIiA6ICI2Mjk5YzhlYzkxM2I0MzMyYjZiMDJhOTFmNDk2MzJhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJIaW5hTGluayIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81MjZjYWMxMDBhODhhYWY1ZWM0MmEyOWJjZjc4Yjk0YTJiNTgwNDM0ZWRjMTM1YTEzZDMxZTc0ZmM3OGQ4ODI1IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
