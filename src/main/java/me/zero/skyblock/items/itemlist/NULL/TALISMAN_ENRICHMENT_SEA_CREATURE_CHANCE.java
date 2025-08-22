package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TALISMAN_ENRICHMENT_SEA_CREATURE_CHANCE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Sea Creature Chance Enrichment";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TALISMAN_ENRICHMENT_SEA_CREATURE_CHANCE"; 
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
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isEnchanted() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MDA4OTMzMCwKICAicHJvZmlsZUlkIiA6ICI4MDBmNmU2ZGNiMTk0Yzc2OGE1OWU1Y2Q2MzFlNjI2YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5dXl1dXUxIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzkyYzc3MDQ1YTQ2OTgyYjQwNjIxYmZjNWIwNTgxNTllOTYxMzQwZDEwNzZjODFiOTY1MTc2NjQ3NDVlYjhjY2YiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
