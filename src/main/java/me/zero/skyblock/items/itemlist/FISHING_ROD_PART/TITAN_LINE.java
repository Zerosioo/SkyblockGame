package me.zero.skyblock.items.itemlist.FISHING_ROD_PART;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TITAN_LINE extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Titan Line";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TITAN_LINE"; 
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
        return ItemType.FISHING_ROD_PART;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.RARE;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTczOTk4ODE2NTA0NiwKICAicHJvZmlsZUlkIiA6ICIzOTg5OGFiODFmMjU0NmQxOGIyY2ExMTE1MDRkZGU1MCIsCiAgInByb2ZpbGVOYW1lIiA6ICI4YjJjYTExMTUwNGRkZTUwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzlhODUwYTRmNzIxYmMxNTBiYjcyYjA2N2U1MDc0YzgyNTEwNThhNmI5MTExNjkxZGEzMTViMzkzNDY3YzFhYTkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
