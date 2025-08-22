package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REVENANT_GENERATOR_8 extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Revenant Minion VIII";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REVENANT_GENERATOR_8"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTQ1MjA0NjQzOCwKICAicHJvZmlsZUlkIiA6ICJmNzg5OWI1ZGEzZGM0ZTY0YmFlM2QyMmYzMWFjMzBhZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJwaXhlbGJsb2IxMjEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU3MjI4ZGVkYmZmOWUxMTRkNWU0Y2U3ZjhlMzljM2JmYjA3ZjJjMmYxMjE1NDVhOGRjNzgwM2RmYzA0ODQ3ODYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
