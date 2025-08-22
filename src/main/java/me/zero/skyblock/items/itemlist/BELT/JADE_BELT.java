package me.zero.skyblock.items.itemlist.BELT;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JADE_BELT extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Jade Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JADE_BELT"; 
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
        return ItemType.BELT;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.SKILLED;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1MjU0NjYzMSwKICAicHJvZmlsZUlkIiA6ICJiZDNhNWRmY2ZkZjg0NDczOTViZDJiZmUwNGY0YzAzMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJwcmVja3Jhc25vIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdlZDMwYmEwNDM1MzA3YmYwNGExNTA0YzU4NmE4ZmZkNzk0OWMwNjg0YjBmMDE1NmFhOTNmYjkyMWNjNmRmMDMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
