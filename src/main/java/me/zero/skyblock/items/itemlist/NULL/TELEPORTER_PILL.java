package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TELEPORTER_PILL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Teleporter Pill";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TELEPORTER_PILL"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3MDU4NTk0Njc0NCwKICAicHJvZmlsZUlkIiA6ICJkYmQyYjU4N2VjMWY0ZTgxYTNkOGFlODM5OWJiMDFjMCIsCiAgInByb2ZpbGVOYW1lIiA6ICJjYXRzaW5zcGFjZWUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzIyMDU4YzdjYzg1MjFlZTE1OTllODllM2UyYTEzYWM2ZTBmYWMyY2UwYjM2NjdmOWI3OTU1MTcwZjFjYWUzZSIKICAgIH0KICB9Cn0=";
    }

}
