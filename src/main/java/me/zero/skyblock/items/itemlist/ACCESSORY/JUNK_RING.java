package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JUNK_RING extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Junk Ring";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oOne man's trash","§8§ois another man's","§8§otreasure.")); 
    }

    @Override
    public String getId() {
        return "JUNK_RING"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTc0MDA3MTU0MjQwMSwKICAicHJvZmlsZUlkIiA6ICJhNTdmZDE5MGZmM2U0YjBkYTEzMmY2OGUzOTU3ZjViMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ4Y2VwdGlvbl9udWxsIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRjOTIwZDM1OTNlZDQ5MzZkZWZjODk0Yjg4YzQzYTJiYjBiNTBjM2ExZTlhNmRkOGU4NTljYjI3YmQzY2FiZCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
