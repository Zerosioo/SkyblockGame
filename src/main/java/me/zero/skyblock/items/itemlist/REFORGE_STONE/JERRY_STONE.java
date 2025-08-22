package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JERRY_STONE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Jerry Stone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JERRY_STONE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyODg5NzIyMjA2MywKICAicHJvZmlsZUlkIiA6ICJkMWY2OTc0YzE2ZmI0ZjdhYjI1NjU4NzExNjM3M2U2NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaW9saWVzdGEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDBiNjM4NDY3YjVlZTMwNjA4ODM5MDkxOWU2NWRiNDI2N2IwMDZkMjhiNmYxMmE0OGJkOTIyNTUyYmZjMzM2NyIKICAgIH0KICB9Cn0=";
    }

}
