package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MEDIUM_FISHING_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Medium Fishing Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MEDIUM_FISHING_SACK"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NTM1NjQ4MywKICAicHJvZmlsZUlkIiA6ICI4YzQwMGUyYTNiNjI0YTkzODBkYzdlZWNkMmE3NDNhNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJaemVydnluIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZmNzU4NzFjOTBiOTRmNGZiYzE2N2UzNTFkMzZlOGFlYWUxY2MyZmVjMDNiMTY2MjkwMDdmNzRjOTg5ZGU2NDgiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
