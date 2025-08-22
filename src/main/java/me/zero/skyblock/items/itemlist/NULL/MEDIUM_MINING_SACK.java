package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MEDIUM_MINING_SACK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Medium Mining Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MEDIUM_MINING_SACK"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NTQ3NTMzMCwKICAicHJvZmlsZUlkIiA6ICIyZGI4ZTYzYzFlMTc0NGE3ODIyZDNmNjBlYmNmYzI5ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBcmtTYW5kYm94IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzEwMGIxYmY4NTU0OTg1ZjNkZWNmNTQ4ODY5MjJhZDIwZDE0NDQzODU2NGVmN2E1YjUyY2VkNzFiYzlkZDA0YmIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
