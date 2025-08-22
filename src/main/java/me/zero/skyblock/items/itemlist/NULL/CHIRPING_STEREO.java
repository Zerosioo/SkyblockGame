package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHIRPING_STEREO extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Chirping Stereo";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oWhile nobody is","§8§osure who came up","§8§owith the genius","§8§odesign, everyone","§8§oagrees that they","§8§oare one of the","§8§otrue engineering","§8§ogreats.")); 
    }

    @Override
    public String getId() {
        return "CHIRPING_STEREO"; 
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
    public int getPrice() {
        return 100000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5Njg2OTE5NjcyNiwKICAicHJvZmlsZUlkIiA6ICJmZWYyZDZjYzY5ZGI0ZWM5OWQzYzI5MzBmYzRmNTBhYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJsb3Zlbm90d2FyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFhYmIzNjE0MDA1MmNhMjVkMTU5MTA3ZTJmNTRiZmM3OTIxOWU2YjJjNDc2ZmQwZDcwNGMxYWQ1Zjg3MTAxZjYiCiAgICB9CiAgfQp9";
    }

}
