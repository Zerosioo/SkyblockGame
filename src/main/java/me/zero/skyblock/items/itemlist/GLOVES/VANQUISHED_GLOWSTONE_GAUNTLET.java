package me.zero.skyblock.items.itemlist.GLOVES;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VANQUISHED_GLOWSTONE_GAUNTLET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Vanquished Glowstone Gauntlet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VANQUISHED_GLOWSTONE_GAUNTLET"; 
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
        return ItemType.GLOVES;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getPrice() {
        return 118720;
    }

    @Override
    public int getIntelligence() {
        return 15;
    }

    @Override
    public int getMiningFortune() {
        return 7;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0ODQ5NTM4Mzg4OCwKICAicHJvZmlsZUlkIiA6ICI0NDAzZGM1NDc1YmM0YjE1YTU0OGNmZGE2YjBlYjdkOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDaGFvc0NvbXB1dHJDbHViIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2U1ZmJjNDcwY2FmNGI0MzA5NGZkZWFkODIxZWMzOGQ1NzI3OGRjYTVmZjQ3NjM4YWYyN2JjZTVkNDIzYmJhOWMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
