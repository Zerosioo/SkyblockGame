package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BAT_PERSON_HELMET extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bat Person Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BAT_PERSON_HELMET"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public int getDefense() {
        return 15;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0Mzk3OTcwMywKICAicHJvZmlsZUlkIiA6ICI3ZjU2ZjY1MDI2NjY0ZmM1OWFjNWYyYjVjMTNlZGY3NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXhBbnRvbnkiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTgzYjNmMDRmYzE2YmMyYzJjYjM2YTEyMDQ0MjY1YjBiOTMzZjNkZmEyYjM0MmViNDU3OThmZjdkNzE1YjBkOCIKICAgIH0KICB9Cn0=";
    }

}
