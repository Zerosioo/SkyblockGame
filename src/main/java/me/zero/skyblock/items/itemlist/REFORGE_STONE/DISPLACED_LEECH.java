package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DISPLACED_LEECH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Displaced Leech";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DISPLACED_LEECH"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwODA2MzExMTg4OCwKICAicHJvZmlsZUlkIiA6ICIxOTI1MjFiNGVmZGI0MjVjODkzMWYwMmE4NDk2ZTExYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTZXJpYWxpemFibGUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGUzMmNlNWFkZTA2YWZmOWQ2OTgzODIwODBkZWE1Mzk5NDc2NTlmYjU4N2U1OGQ0ZjFkN2MxZmY5MjQwZTNjOCIKICAgIH0KICB9Cn0=";
    }

}
