package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LESSER_SOULFLOW_ENGINE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Lesser Soulflow Engine";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LESSER_SOULFLOW_ENGINE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjAyNDE0MCwKICAicHJvZmlsZUlkIiA6ICJmYjNhZTU0OTU3ODQ0MGVlODIzODJlMDY2MzlhYTkzMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJXZWx0ZXJ3ZWlnaHQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2QwNDVjYTNlOGEyOWUxOTkzMTY1NjM2MmUxMjQ3NzYzM2E2ODljNDgwMWQ4ZTIxZjdkYTBmODBjYzU5ZTU2YiIKICAgIH0KICB9Cn0=";
    }

}
