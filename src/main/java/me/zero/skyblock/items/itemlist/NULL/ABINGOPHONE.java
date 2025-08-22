package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ABINGOPHONE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "AⒷiphone";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ABINGOPHONE"; 
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
    public Soulbound getSoulbound() {
        return Soulbound.SOLO;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4NjgyMDI5MTY3NiwKICAicHJvZmlsZUlkIiA6ICJkZjRiYzNkNTA2MWM0YThkODk4M2FlNzU1MTgxZDVhZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJEaWRpX0paIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZjMzM3N2UwNGQ3YTI4ZTkzMDI1NzRhYjYwOWZiN2FjNGU3MmJkZWRhMTAxODlmM2U1NjBjZmE1ZjlmMTZlZmIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
