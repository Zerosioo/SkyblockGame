package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OBSOLITE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Obsolite";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Practically a","§7fossil.")); 
    }

    @Override
    public String getId() {
        return "OBSOLITE"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyNTMyNTc3ODQwMSwKICAicHJvZmlsZUlkIiA6ICIyZGI4ZTYzYzFlMTc0NGE3ODIyZDNmNjBlYmNmYzI5ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBcmtTYW5kYm94IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzI1ZTI5YmZmZTRkMTQ5ODdlOTU1MmYzNjMwMjA0OTU0MjMxYTcwZWQxM2ZiZTdkZmM1NzU0YmI3ZTllNzMyYzMiCiAgICB9CiAgfQp9";
    }

}
