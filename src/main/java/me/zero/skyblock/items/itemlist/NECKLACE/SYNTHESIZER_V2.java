package me.zero.skyblock.items.itemlist.NECKLACE;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SYNTHESIZER_V2 extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Synthesizer v2";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SYNTHESIZER_V2"; 
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
        return ItemType.NECKLACE;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.EPIC;
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
    public int getPrice() {
        return 9280;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY0ODY3Mjg2NzY3NCwKICAicHJvZmlsZUlkIiA6ICI5ZWU3NTUxOGQyZWE0Y2Q4OGJiNGI1YTZkNmVhNTFjYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaWNyb3MxMTgyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZkYzJjMTRlMGI4OTM1MGI5OGE3Zjg0YjQ5ZDVkN2M3MmM4ODBmNDdiNzlmMGQ5YzdkMmI2MTZkNjViNzM4MGMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
