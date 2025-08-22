package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BUILDER_LETTUCE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Lettuce";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BUILDER_LETTUCE"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4ODMzNTEwMTI2NywKICAicHJvZmlsZUlkIiA6ICI3ZjU2ZjY1MDI2NjY0ZmM1OWFjNWYyYjVjMTNlZGY3NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXhBbnRvbnkiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDQ2NGRhZGQyZjgyMTVkZTkzYTc1NzA5ZjhjMzU3YTEwNzRhNzFhYTcyMDU1ZGI4ZDQ0N2JhYjRjZDE3Y2Y3NiIKICAgIH0KICB9Cn0=";
    }

}
