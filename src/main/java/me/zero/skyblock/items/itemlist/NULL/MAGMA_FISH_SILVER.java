package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAGMA_FISH_SILVER extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Silver Magmafish";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MAGMA_FISH_SILVER"; 
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
    public int getPrice() {
        return 1600;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MjQ4ODA1Mzg4MywKICAicHJvZmlsZUlkIiA6ICIzZjM4YmViZGYwMWQ0MjNkYWI4MjczZjUwNGFiNGEyNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJjazM0Nzk0MjM1NzUzNzMxIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM1M2UxMGMwNzEyZmYyOGQ4NzdiOWNlZjk5MGQ2MTNiMjFkODQzNzMyNjYzZjRhYWMzODVkYzdkYjk3YWM1NGEiCiAgICB9CiAgfQp9";
    }

}
