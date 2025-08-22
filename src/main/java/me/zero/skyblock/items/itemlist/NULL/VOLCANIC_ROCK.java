package me.zero.skyblock.items.itemlist.NULL;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VOLCANIC_ROCK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "%%red%%Volcanic Rock";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VOLCANIC_ROCK"; 
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
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNDAzMTg1MzkzMCwKICAicHJvZmlsZUlkIiA6ICIxNDU1MDNhNDRjZmI0NzcwYmM3NWNjMTRjYjUwMDE4NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJMaWtlbHlFcmljIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2I2M2M3ZjE4ODA3MGQxZjI3ZGZmZjhiZTRkNTI1OGM1YTMxNzAwOWY1NjZkZmQ5ZTg2MWNmNmU1ZjhmYjM4ZTIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
