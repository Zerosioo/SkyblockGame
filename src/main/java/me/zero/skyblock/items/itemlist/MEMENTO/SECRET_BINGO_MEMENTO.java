package me.zero.skyblock.items.itemlist.MEMENTO;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SECRET_BINGO_MEMENTO extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Bingo's Secrets";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SECRET_BINGO_MEMENTO"; 
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
        return ItemType.MEMENTO;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.SPECIAL;
    }

    @Override
    public boolean isStackable() {
        return false;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwMDczOTg0MTU1OCwKICAicHJvZmlsZUlkIiA6ICIzM2NjZDBjYTc2MTg0ODY4YWMyNjc0YTg2YmEzMDRhNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJKaWlzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzVkMzRmYjhlZDc2ZjU1ZDFkNTU5YzMzYWFhNTBmODNmZTM2MWYxZTRiZWU5MTVkZTUyZWI4NjAyYWVmZjJhOTciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
