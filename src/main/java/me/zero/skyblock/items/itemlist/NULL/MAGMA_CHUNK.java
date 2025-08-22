package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGMA_CHUNK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Magma Chunk";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§o\"If Magma Cream","§7§ois the cement,","§7§oMagma Chunks are","§7§othe bricks.\" -","§7§oMagma Cube local","§7§oexpert.")); 
    }

    @Override
    public String getId() {
        return "MAGMA_CHUNK"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTU5MDUwMjk4OTU4MCwKICAicHJvZmlsZUlkIiA6ICJhMjk1ODZmYmU1ZDk0Nzk2OWZjOGQ4ZGE0NzlhNDNlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJWaWVydGVsdG9hc3RpaWUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2M0MGU5NGNiNDU1MTE5YTdmZjBlODBmZjVmNGMwNGFiMDJiOTk1YTZjNmIwMjdjNGI1MDM2YzUwN2FlMTJkOSIKICAgIH0KICB9Cn0=";
    }

}
