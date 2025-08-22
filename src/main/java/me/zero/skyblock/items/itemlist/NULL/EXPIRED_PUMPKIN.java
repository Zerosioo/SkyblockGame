package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EXPIRED_PUMPKIN extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Expired Pumpkin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EXPIRED_PUMPKIN"; 
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
        return Rarity.UNCOMMON;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5OTcxNjQ1NjU0MiwKICAicHJvZmlsZUlkIiA6ICIzNzdmYzE2NzE2ZDY0NDM4YjNkYjQzYzYyOWExYTkyOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJTd2VkZW5zdHlsZTM0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzgyODkyMDk5MjBkNWYxOTE3NWQ3OWFlNmFhNmFhN2JiODk5MTQ0YTdiYzRmMzYxMmY0MzQ3ZWNhMjVlNTcyZmEiCiAgICB9CiAgfQp9";
    }

}
