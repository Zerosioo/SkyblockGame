package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RING_OF_ETERNAL_LOVE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Ring of Eternal Love";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Ramero and Joliet's","love transcends the","boundaries of time,","space, and fate","itself.")); 
    }

    @Override
    public String getId() {
        return "RING_OF_ETERNAL_LOVE"; 
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
        return Rarity.LEGENDARY;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyODQwMTMxMzQzMywKICAicHJvZmlsZUlkIiA6ICJjN2Y2Nzk3ZmE4ZGM0NTdiYTkxNTU0NWIwMGU3M2UzMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJlZGd5c3BlbmNlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2M0YjNlMWY2N2ZjYjg4MWQ1OThjZTE4MDU2Y2I5ZWI2Y2I2NmFmMDExMWYyYTVlYjY4ZTFlMzU1MGM2YzM4ODEiCiAgICB9CiAgfQp9";
    }

}
