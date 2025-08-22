package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PLASMA extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Plasma";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oStable magnetic","§7§ofield, but","§7§ohandle with","§7§ocaution.")); 
    }

    @Override
    public String getId() {
        return "PLASMA"; 
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
    public int getPrice() {
        return 20000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMDY0MjExNzM0NywKICAicHJvZmlsZUlkIiA6ICJkZTU3MWExMDJjYjg0ODgwOGZlN2M5ZjQ0OTZlY2RhZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNSEZfTWluZXNraW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzVhYTgzMzJiYmVjNGE5NThmZWEyYmU2NGI4ZjE2ODJmNWQ4MjQ3NDUxYWEyYjc1NjllZGQwNDk4NDM3ZDcwNiIKICAgIH0KICB9Cn0=";
    }

}
