package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PESTHUNTER_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Pesthunter Ring";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PESTHUNTER_RING"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5OTU4Njk2NTg1NiwKICAicHJvZmlsZUlkIiA6ICI4YWFlYTdlYjViOWM0ZWEwODUxNWU3MDhhZGIxODBkNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYVBhODA3MTEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWQwNmI3NGQ2YmQwMmI3OTVmN2JjYmYxN2FjM2I3N2QzYmM1N2I2OTVhOGQ1NGExNzcwYzc2ZTg0ODk2YzhmOCIKICAgIH0KICB9Cn0=";
    }

}
