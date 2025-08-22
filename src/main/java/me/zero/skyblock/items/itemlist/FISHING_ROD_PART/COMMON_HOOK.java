package me.zero.skyblock.items.itemlist.FISHING_ROD_PART;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COMMON_HOOK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Common Hook";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COMMON_HOOK"; 
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
        return ItemType.FISHING_ROD_PART;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.STARTER;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTY2NjM1OTI2MSwKICAicHJvZmlsZUlkIiA6ICIxMTM1Njg1ZTk3ZGE0ZjYyYTliNDQ3MzA0NGFiZjQ0MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXJpb1dsZXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDIzNTM4OGYwOTFiN2ZkMTMzOTcxNTFmY2E1ODBmZGY5YTQxYzJhMGEyOTdmODg3ODM4NzEwZjYyOWFhM2ZkNiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
