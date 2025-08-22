package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JUNK_ARTIFACT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Junk Artifact";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oOne man's trash","§8§ois another man's","§8§otreasure.")); 
    }

    @Override
    public String getId() {
        return "JUNK_ARTIFACT"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MDA3MTUzNjk5NSwKICAicHJvZmlsZUlkIiA6ICI3ZGY4NmY1MWFjZmI0MjQzYTkzNDQ1OTAyZDEzYTc0MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNclJpcHRpZGUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTcyNzgxMmY3MDhkZWUxODI2YmNlZWNkYWRiOWM3NzE5ZTNkMGYzODVhM2IyNTE1ZDAwYjVmNjY1ZDhiYTgzZSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
