package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JERRY_BOX_MEGA extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mega Jerry Box";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JERRY_BOX_MEGA"; 
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
        return Rarity.MYTHIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNzM2NjY2NjczNiwKICAicHJvZmlsZUlkIiA6ICJmMTA0NzMxZjljYTU0NmI0OTkzNjM4NTlkZWY5N2NjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJ6aWFkODciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGFkZTZkNjc4ZWU4MmZhNWFlOWVkYTNmYTMzZDM5YTQxNDEzZThkZWU0NDM2ZjNlYjUxYmQ4OTcxMzIxZjc5IgogICAgfQogIH0KfQ==";
    }

}
