package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GEMSTONE_CHAMBER extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Gemstone Chamber";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GEMSTONE_CHAMBER"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NzAwMzkzODk5OCwKICAicHJvZmlsZUlkIiA6ICIyMDZlMWZkYjI5Yzk0NGYxOTQ5OTg4NzAwNTQxMGQ2NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJoNHlsMzMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWUwYWE0MDg1NmFlMGI0MWU0Yzg0ZmY2NTYxMzlhN2NlOGY0M2U5ZWI3N2I4MDVjN2I5YzA0ZDlkNGI3YmE3IgogICAgfQogIH0KfQ==";
    }

}
