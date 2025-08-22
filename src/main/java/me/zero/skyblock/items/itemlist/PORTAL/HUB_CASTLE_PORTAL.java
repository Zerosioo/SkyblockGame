package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HUB_CASTLE_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to the Hub Castle";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HUB_CASTLE_PORTAL"; 
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
        return ItemType.PORTAL;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxMTU5MzM4MzQxNSwKICAicHJvZmlsZUlkIiA6ICJiYjdjY2E3MTA0MzQ0NDEyOGQzMDg5ZTEzYmRmYWI1OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJsYXVyZW5jaW8zMDMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmI3ZTEwNTZmMmI3ZTk4ODg0NWY4M2RjYWE5ZTY4Y2I4NTFmNjE0YzA1ZjcyMjdlOGM4N2MwZDhmODdkZjUzZiIKICAgIH0KICB9Cn0=";
    }

}
