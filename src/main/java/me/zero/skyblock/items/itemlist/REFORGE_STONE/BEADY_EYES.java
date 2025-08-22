package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BEADY_EYES extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Beady Eyes";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BEADY_EYES"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5Njk0NTAxMjA3MiwKICAicHJvZmlsZUlkIiA6ICJiZWNlZGU1YmRkODY0YTkwOTc3MTRmODk0ZWUxNmE3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTYW1hQ29tcG9zZXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmM2N2ZlODFmMGJiM2RlZDgwZmZhN2M2NDdhZGExMmEwZmYxMWZkMDZkM2NmM2FkYzI0MWFhN2MxMTViMTk2MCIKICAgIH0KICB9Cn0=";
    }

}
