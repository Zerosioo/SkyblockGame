package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HYPER_CATALYST_UPGRADE extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Hyper Catalyst Upgrade";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HYPER_CATALYST_UPGRADE"; 
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
    public int getPrice() {
        return 500;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwNzA3NDgyMTQ3NSwKICAicHJvZmlsZUlkIiA6ICI0ZWQ4MjMzNzFhMmU0YmI3YTVlYWJmY2ZmZGE4NDk1NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJGaXJlYnlyZDg4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzEyZTRlYjhhOTAzYzU4NWE3OTU5ZWZlM2Q3YWYwOWFjZDExOWVmMGE2OGRmODYxMTUyYzg0ODA4MDRmODIyODEiCiAgICB9CiAgfQp9";
    }

}
