package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAMP_CYAN extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Cyan Lamp";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LAMP_CYAN"; 
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
        return Rarity.COMMON;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYxNjkxNzExOTQyOSwKICAicHJvZmlsZUlkIiA6ICJiYjdjY2E3MTA0MzQ0NDEyOGQzMDg5ZTEzYmRmYWI1OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJsYXVyZW5jaW8zMDMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmNjMTEwYzJjNDVlODU3NDhiYThkMWIwYTFkMDg0MmZjN2ZiNjIyNjMxZDcyNTM4NWE4OTcxMjcyNWIxNmZhNyIKICAgIH0KICB9Cn0=";
    }

}
