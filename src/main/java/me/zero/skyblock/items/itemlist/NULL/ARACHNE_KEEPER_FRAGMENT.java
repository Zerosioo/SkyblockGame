package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARACHNE_KEEPER_FRAGMENT extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Arachne's Calling";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARACHNE_KEEPER_FRAGMENT"; 
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
    public int getPrice() {
        return 400;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDAzOTk3MjI1OCwKICAicHJvZmlsZUlkIiA6ICI0NTk3YjBiNWZlZGY0MTg0YjI2YWU0NWZjYmVhODVmMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJQc3lrb19EYXJrIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFmM2IzYzkzYmY1MjJmNTQ2NGI5YTA1OGRkOWZlOThkMGI1ZGYwZmVjOTU4N2M2ODgyOWUyYTc2MzkwZDU1NzUiCiAgICB9CiAgfQp9";
    }

}
