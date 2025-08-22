package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ABIPHONE_XII_MEGA_COLOR extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Abiphone XII Mega Color";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ABIPHONE_XII_MEGA_COLOR"; 
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
    public int getPrice() {
        return 150;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NDI0Njk2Mzc1NSwKICAicHJvZmlsZUlkIiA6ICJiNjc3NTgwYzExYmU0ZjNiODI1OGM0YjBkNzNhNzg0ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJPZmZpY2lhbGx5SksiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWZjY2JjOTM5NmRkYzJhMWIwNzg0Njg0MmMwZDY1NjFkYjEzZDFjYjQ1ZDYyOTljMmZkOTgxYTIzMWYwNTc0NCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
