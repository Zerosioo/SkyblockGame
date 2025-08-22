package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOT_DOG extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Hot Dog";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Deposit on Joey's","plate.")); 
    }

    @Override
    public String getId() {
        return "HOT_DOG"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjgwODQ2MTU5NywKICAicHJvZmlsZUlkIiA6ICIwYWMwY2IxMTI1MWE0ZjAwOTJjNjIyNzM2NjczMDNmNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDbG91Y2wiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODI0Yzg2NjdlMWU2NzA5NTI0ZDhmNzYzZDFhZGQwNWE4NDVlNWJhMGE0ZmU5MDc2ZmUwYjU4NzE5MWVmNWMwIgogICAgfQogIH0KfQ==";
    }

}
