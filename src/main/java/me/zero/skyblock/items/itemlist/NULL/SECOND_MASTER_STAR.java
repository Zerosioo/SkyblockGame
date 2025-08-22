package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SECOND_MASTER_STAR extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Second Master Star";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SECOND_MASTER_STAR"; 
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
    public boolean isDungeonItem() {
      	return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTgwMjU5NjQ3OSwKICAicHJvZmlsZUlkIiA6ICI4ZGU4ZWU3MTMyMTY0NGNhYTllZjJlNTVjODRjNGU4ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJIdW5kZXNjaG9uVE0iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWQ5OTEzYTY2MWMzOGY1ZjcwMGI4MDc5OGE4YzQ4NWQzMzJkNzgzNDViNzY3MWQwYTI0OGE4NGIyMDk5YmY0ZSIKICAgIH0KICB9Cn0=";
    }

}
