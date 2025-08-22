package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROUGH_PERIDOT_GEM extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Rough Peridot Gemstone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROUGH_PERIDOT_GEM"; 
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
        return 3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNzY0MjIyNzIxNSwKICAicHJvZmlsZUlkIiA6ICIzMjNiYjlkYzkwZWU0Nzk5YjUxYzE3NjRmZDRhNjI3OSIsCiAgInByb2ZpbGVOYW1lIiA6ICJOcGllIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzIzYzJiMTk0ZDM4OTIyZTQ5M2NmYWYyNzZkNjhmNmY5YmEwYzBjZDNhNjQ1YmYyYTA2ZGM1MTQyNGVhNjIyZDciCiAgICB9CiAgfQp9";
    }

}
