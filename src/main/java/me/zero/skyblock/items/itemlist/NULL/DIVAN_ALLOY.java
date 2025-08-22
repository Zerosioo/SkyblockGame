package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIVAN_ALLOY extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Divan's Alloy";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oThe legendary","§7§oDivan explored","§7§owhere no other","§7§oman has set","§7§ofoot, and came","§7§oback with this","§7§oincredibly rare","§7§oalloy.")); 
    }

    @Override
    public String getId() {
        return "DIVAN_ALLOY"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1OTIwOTQ5OTE4MiwKICAicHJvZmlsZUlkIiA6ICI5ZWU3NTUxOGQyZWE0Y2Q4OGJiNGI1YTZkNmVhNTFjYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaWNyb3MxMTgyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E4NjVmMzQ0YmY3YzBmZTE3MGU4NGJjMGEyMjJiY2I4ZWU3NDE4NjI1MzFmNGEzYWRmNmJjOTMwMDIzODc3MjIiCiAgICB9CiAgfQp9";
    }

}
