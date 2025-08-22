package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLUE_GIFT_TALISMAN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Blue Gift Talisman";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLUE_GIFT_TALISMAN"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2OTUxNDEyNDM5NCwKICAicHJvZmlsZUlkIiA6ICJiMTM1MDRmMjMxOGI0OWNjYWFkZDcyYWVhYmMyNTQ1MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUeXBrZW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWI4NWUyOWYyOWVjOWE5MGU0ODJlYTViODM5MWJjYjQ1NjBiYmFlMGRjZDE1ZDdjZTFkODYwMTZiNDM1NmU5OCIKICAgIH0KICB9Cn0=";
    }

}
