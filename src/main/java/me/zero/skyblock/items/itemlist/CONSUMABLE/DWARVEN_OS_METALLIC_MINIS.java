package me.zero.skyblock.items.itemlist.CONSUMABLE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DWARVEN_OS_METALLIC_MINIS extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Dwarven O's Metallic Minis";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DWARVEN_OS_METALLIC_MINIS"; 
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
        return ItemType.CONSUMABLE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNjQ5MTA3NjQzOSwKICAicHJvZmlsZUlkIiA6ICIwMzcyOTQyZWRhOTQ0MjQ3YWRlODcyZjRjYjQxZTFkZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJiZW5rZXRvbWkiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTY2NjNiNTQ0YWU4ZjhhNGNlNGNiMGNiYjZmOTE5MGVmZTVjZDk5OTYwNDc1MjA3MDVjMjc2Njk1YWQxNzM0IgogICAgfQogIH0KfQ==";
    }

}
