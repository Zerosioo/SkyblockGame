package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FINE_ONYX_GEM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Fine Onyx Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FINE_ONYX_GEM"; 
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
        return 19200;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNzY0MTgzMjQ5NSwKICAicHJvZmlsZUlkIiA6ICJiZWNlZGU1YmRkODY0YTkwOTc3MTRmODk0ZWUxNmE3MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTYW1hQ29tcG9zZXIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzg3YTMyNjMzMWZlMjdmN2VlMDc0Zjk3NzI3NjA0YzQ5NWY5NWMzNzgxMjEzMDJlODc5ZTFmNDBiYTRkMjBhOCIKICAgIH0KICB9Cn0=";
    }

}
