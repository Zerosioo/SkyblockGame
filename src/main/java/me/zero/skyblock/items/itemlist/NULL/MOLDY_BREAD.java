package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MOLDY_BREAD extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Moldy Bread";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MOLDY_BREAD"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5NjE5MTg4NDI2NiwKICAicHJvZmlsZUlkIiA6ICIzOTg5OGFiODFmMjU0NmQxOGIyY2ExMTE1MDRkZGU1MCIsCiAgInByb2ZpbGVOYW1lIiA6ICI4YjJjYTExMTUwNGRkZTUwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJmYmZiZGEzZGFiNDUyYzNjMWM3NmQ3ZDUzNTc3YWVhZjgyYWFlOTMwYTMzNmZjOWZkMGIyMzg0ZDcwNzhhZGEiCiAgICB9CiAgfQp9";
    }

}
