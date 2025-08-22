package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CONTROL_SWITCH extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Control Switch";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CONTROL_SWITCH"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyNDU0NjI1OTk0MywKICAicHJvZmlsZUlkIiA6ICI4YmM3MjdlYThjZjA0YWUzYTI4MDVhY2YzNjRjMmQyNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3RpbnZlbnRpdmUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmFjZTU5ODdmYmNjOWZmYzVhMzY5Mjc5ODZhNTc3NzdjNWE2MjIyMjNiYjk2MjE0MjEyYjgzYzYzNzU1NzNhNCIKICAgIH0KICB9Cn0=";
    }

}
