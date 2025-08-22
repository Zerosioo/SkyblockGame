package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UBIKS_CUBE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ubik's Cube";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "UBIKS_CUBE"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczMTQyODAxMDM3NywKICAicHJvZmlsZUlkIiA6ICI1OTgyOWY1ZGY3MmM0ZmFlOTBmOGVhYmM0MjFjMzJkYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJQZXBwZXJEcmlua2VyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMyMDU0NGQxNmNmMDg4NzY5MTJjY2EwODhiZDg1NWMzYzNiZTMxM2NiMDg3ZTg1MzhhMTVhMmExNzc1MzJlYTciCiAgICB9CiAgfQp9";
    }

}
