package me.zero.skyblock.items.itemlist.PORTAL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RIFT_WIZARD_TOWER_PORTAL extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Portal to The Rift";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RIFT_WIZARD_TOWER_PORTAL"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MTkxMjM5OTYxNCwKICAicHJvZmlsZUlkIiA6ICJkMTJiOTk3ZWI2YTQ0ODQ5ODJmNDE1ZTI1NzFlNmY4NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUd2lybGJlbGwiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjI2MTkyNjA5ZDZjNDZhZGU3M2U4MDdmYzQwZGJjM2ExYTFhZmJiNDU2YWUxNjU3ODViMGZlODM0ZGQxY2I1NyIKICAgIH0KICB9Cn0=";
    }

}
