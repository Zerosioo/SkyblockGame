package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PARTY_GIFT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Party Gift";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PARTY_GIFT"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1MjUxMDY0MCwKICAicHJvZmlsZUlkIiA6ICI4YWFlYTdlYjViOWM0ZWEwODUxNWU3MDhhZGIxODBkNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYVBhODA3MTEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDhhYTJmOWJmZmQ4ODUzNjQ2YzEzNzVkM2RlNzFiODE4N2JkNDI2MzMyZDlmOWQ3MTIyMTZmN2U5MmE5MzBkIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
