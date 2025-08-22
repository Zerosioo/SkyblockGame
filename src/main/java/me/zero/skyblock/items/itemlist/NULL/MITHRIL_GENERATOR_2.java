package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MITHRIL_GENERATOR_2 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Mithril Minion II";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MITHRIL_GENERATOR_2"; 
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
        return Rarity.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNzc3OTY3MjgyNCwKICAicHJvZmlsZUlkIiA6ICI0ZDcwNDg2ZjUwOTI0ZDMzODZiYmZjOWMxMmJhYjRhZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzaXJGYWJpb3pzY2hlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ExNzAzNWI5ZDEyZTA3Y2E4ZTFlZjFlMGVkNDE5Nzg3MzYzYzlhZTdjZDM1ZjRkZDA5MmY0ZjBjNTRkODQxYmMiCiAgICB9CiAgfQp9";
    }

}
