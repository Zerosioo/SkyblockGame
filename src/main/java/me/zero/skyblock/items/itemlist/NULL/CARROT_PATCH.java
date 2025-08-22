package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CARROT_PATCH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Carrot Patch";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CARROT_PATCH"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NDEzMjAwNywKICAicHJvZmlsZUlkIiA6ICJmN2QxOWQxNTZhY2I0NDE2OGQ4YTAxYThkNWYwMmEyZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVGbG9vZDQyNEsiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWJiODRhYjI2NTI4ODY4NDg3MjUzZDg1YWQ3MGFlZmVmMWUzODZjMjdmNWNhZWUzNzZjODFkNmY3Njg5ZTQ4ZCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
