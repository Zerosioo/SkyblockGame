package me.zero.skyblock.items.itemlist.CLOAK;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ICHTHYIC_CLOAK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Ichthyic Cloak";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ICHTHYIC_CLOAK"; 
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
        return ItemType.CLOAK;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 4500;
    }

    @Override
    public int getFishingSpeed() {
        return 6;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjU1OTU0NTkzMywKICAicHJvZmlsZUlkIiA6ICI2NDU4Mjc0MjEyNDg0MDY0YTRkMDBlNDdjZWM4ZjcyZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaDNtMXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmE4M2IxY2JlODU5MzY4MzgxMDlkNmE2NzBmNWI3ZGVlZDllYjEwNmViYTRjNzE4ZmJlMTE3OWNlOWMwYzkxYSIKICAgIH0KICB9Cn0=";
    }

}
