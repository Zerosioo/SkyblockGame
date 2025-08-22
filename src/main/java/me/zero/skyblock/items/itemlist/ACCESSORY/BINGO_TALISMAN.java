package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BINGO_TALISMAN extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Bingo Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BINGO_TALISMAN"; 
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
        return Rarity.COMMON;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3OTc5Mjg4MTUyOSwKICAicHJvZmlsZUlkIiA6ICI3ZjU2ZjY1MDI2NjY0ZmM1OWFjNWYyYjVjMTNlZGY3NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXhBbnRvbnkiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmYyNTk0NGI3NDY1ZmY0NTg2YTM0MWY4ODFmNDg4YjZmOWQ0YjNmZmMxMDBmNTBhNzcwODcwNzViM2NlYjFiIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
