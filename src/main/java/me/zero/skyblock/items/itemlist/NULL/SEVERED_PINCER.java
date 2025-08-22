package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SEVERED_PINCER extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Severed Pincer";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oHopefully he","§8§odoesn't want","§8§othis back.")); 
    }

    @Override
    public String getId() {
        return "SEVERED_PINCER"; 
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
        return 1000000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTY2NjM2MDYxMSwKICAicHJvZmlsZUlkIiA6ICIxNTUyNmU1OGZhOWE0NjBmODhhNmZhNjk1M2RlNjgzNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJQaWVkcml0YTE3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdlMWUwNzAxZjFmOWU5NzQ3NjVlNGYyYTdjMzNhOTQ1OGM1OTgzMzQ0MDE1MzhkYzlmMjFmNWVkN2UzNWY3OWEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
