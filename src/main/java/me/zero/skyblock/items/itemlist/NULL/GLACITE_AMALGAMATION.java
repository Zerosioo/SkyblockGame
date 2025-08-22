package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLACITE_AMALGAMATION extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Glacite Amalgamation";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§oGlacite resists","§oeven the heat of","§othe great Dwarven","§oForge. The key is","§oto combine rather","§othan to try to","§oreduce.")); 
    }

    @Override
    public String getId() {
        return "GLACITE_AMALGAMATION"; 
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
        return Rarity.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwOTMyNzA0OTI4NiwKICAicHJvZmlsZUlkIiA6ICIzNzRhZGZlMjkyOWI0ZDBiODJmYmVjNTg2ZTI5ODk4YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfR2xvenpfIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzI0NjFlYzNiZDY1NGY2MmNhOWEzOTNhMzI2MjllMjFiNGU0OTdjODc3ZDNmMzM4MGJjZjJkYjBlMjBmYzAyNDQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
