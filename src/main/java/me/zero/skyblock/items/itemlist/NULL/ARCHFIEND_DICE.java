package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARCHFIEND_DICE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Archfiend Dice";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARCHFIEND_DICE"; 
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
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTUwMjU5OTUwOCwKICAicHJvZmlsZUlkIiA6ICI0NmNhODkyZTY4ODA0YThmYjFkYzkwYjg0ZTY5ZjVmZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJPbG8xNjA2IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzhmZjdjNDEwYTRhOGI0YjUxOGI5NGQyMTQwMmQyODkyZmNjOGZhNjhjMzAyODQxN2RkNGVhYThiN2UzNWM1NjgiCiAgICB9CiAgfQp9";
    }

}
