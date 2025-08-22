package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COLD_ONES extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Cola Cooler";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COLD_ONES"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzcxMjU1MCwKICAicHJvZmlsZUlkIiA6ICJjMTJkMmY5ZWJhZGI0ZTllYTIxZmM2M2M3YWY3M2E5NSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEcmVhbXlOZW9uIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQ1MjRkZGZlNTk4ZjAwZDY0M2M4NGZiZGMyNWE5MWU2YTE1YzJlNWIwY2Y4N2YzMmVkNDg0MGQ0OWViYzM4OGIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
