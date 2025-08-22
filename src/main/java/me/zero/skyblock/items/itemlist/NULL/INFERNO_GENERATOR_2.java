package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFERNO_GENERATOR_2 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Inferno Minion II";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFERNO_GENERATOR_2"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0NTY0NTgxOTk5MywKICAicHJvZmlsZUlkIiA6ICIzYjA1NTdlYmVmYjc0MDdmYmFmMjVhN2IyNzYwZTZlMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNcl9JY2VTcGlrZXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjIxMDQwMzQ5MDk2MjNkNjA5NGE1MDYwZTA1YWY2ZGE1Y2JmNzUyYTE4NTgwOTExMzY4ZmEzNmQ2OTQ5MmFmMyIKICAgIH0KICB9Cn0=";
    }

}
