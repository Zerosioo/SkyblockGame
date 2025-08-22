package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POWER_RELIC extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Relic of Power";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POWER_RELIC"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMDEwODgyNzM3NiwKICAicHJvZmlsZUlkIiA6ICI1OWZmOTU1YzMxYjk0MWI0YWQwNDg4NDk0ODkzNzUzOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJNZWdhMzQ5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Q4ZmRjODcwMjNjZmYyNjM1NjQ3N2YyZTA5N2EyZGU4M2I1NTBkODhhNmYxYTg3N2RhNGY5NWM0ZGIxMTU2N2YiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
