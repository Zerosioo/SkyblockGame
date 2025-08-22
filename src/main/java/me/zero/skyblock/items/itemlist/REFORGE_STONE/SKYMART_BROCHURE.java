package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SKYMART_BROCHURE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "SkyMart Brochure";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SKYMART_BROCHURE"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3ODgyMjI1MzQwMywKICAicHJvZmlsZUlkIiA6ICJhNWVmNzE3YWI0MjA0MTQ4ODlhOTI5ZDA5OTA0MzcwMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJkZXBsZXRpbmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDJhMzA0OGY1M2IyNGZiMzZlYmFjNjRkODU4Mzg5MTM1ODgzZjI1ODc0ZTQ1NDZkMWZjZDg5YzMwYmQ2ZjY1NiIKICAgIH0KICB9Cn0=";
    }

}
