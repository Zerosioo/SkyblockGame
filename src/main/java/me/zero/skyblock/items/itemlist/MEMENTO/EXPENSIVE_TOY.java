package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EXPENSIVE_TOY extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Expensive Toy";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oThis toy is said","§8§oto bring","§8§oextraordinary","§8§oluck and","§8§oprosperity to","§8§oits owner. But","§8§oremember, with","§8§ogreat power","§8§ocomes an even","§8§ogreater price","§8§otag.")); 
    }

    @Override
    public String getId() {
        return "EXPENSIVE_TOY"; 
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
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5OTM5NDI1NDY1NSwKICAicHJvZmlsZUlkIiA6ICI4YWFlYTdlYjViOWM0ZWEwODUxNWU3MDhhZGIxODBkNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYVBhODA3MTEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjRhYmQ3MGY3ZDlkZmE0N2MzMGEwOTkyZDNiN2Y1M2Q3NGU3M2VkY2JiM2Y1ZmE4MDYzYjkxNDg2YWM5ZmY0YyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
