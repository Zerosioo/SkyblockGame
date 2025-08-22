package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ABIPHONE_XIV_ENORMOUS_BLACK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Abiphone XIV Enormous Black";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ABIPHONE_XIV_ENORMOUS_BLACK"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 190;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjQwNTIxNTk5NCwKICAicHJvZmlsZUlkIiA6ICIwODFiZTAxZmZlMmU0ODMyODI3MDIwMjBlNmI1M2ExNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJMeXJpY1BsYXRlMjUyNDIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTI1YWNhNjFlMWI4YmVjYTliZWZjYWRkMDgyNjJjNTgyMWUyNzViZTQxNGQ5NGYwYjI3ZTg1ODBmMjBkYmYzYSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
