package me.zero.skyblock.items.itemlist.REFORGE_STONE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OPTICAL_LENS extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Optical Lens";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "OPTICAL_LENS"; 
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
        return ItemType.REFORGE_STONE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0MTA0OTI2OTM0NCwKICAicHJvZmlsZUlkIiA6ICI0NDAzZGM1NDc1YmM0YjE1YTU0OGNmZGE2YjBlYjdkOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJQWFkxIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Q3ZjE2YmQ0NTdlZDI3NzE2MDBkMjJhYjA5MGQ2MjkwMzA0NTU3MTE4N2NlZDM0ZTRmMDQzYTBmYTBiYTIxMTQiCiAgICB9CiAgfQp9";
    }

}
