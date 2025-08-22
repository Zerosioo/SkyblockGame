package me.zero.skyblock.items.itemlist.ACCESSORY;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BINGO_HEIRLOOM extends SItem implements ItemStatistics, SkullItem, Museum {

    @Override
    public String getName() {
        return "Bingo Heirloom";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BINGO_HEIRLOOM"; 
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
        return ItemType.ACCESSORY;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDAzOTI5NDQzMSwKICAicHJvZmlsZUlkIiA6ICIyMmNhZTExMTU4MzA0MjU5OGQ3Nzc2ZGI4YzlhZjZmNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHcmFuZ2VyVGhlRG9nIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RiM2EwNWIxODAyNjBkZDA3NDc5OWQwNWI5MGY2NzkwYjk2MGQ2ZTVjYmEzZGQxMjViYTNiZmQ5Y2MxNTQwODkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
