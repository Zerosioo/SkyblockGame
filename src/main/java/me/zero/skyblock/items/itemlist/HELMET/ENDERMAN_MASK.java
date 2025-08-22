package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENDERMAN_MASK extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Enderman Mask";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENDERMAN_MASK"; 
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
        return ItemType.HELMET;
    }

    @Override
    public Rarity getRarity() {
        return Rarity.UNCOMMON;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.INTERMEDIATE;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public int getStrength() {
        return 1;
    }

    @Override
    public int getHealth() {
        return 1;
    }

    @Override
    public int getDefense() {
        return 1;
    }

    @Override
    public int getIntelligence() {
        return -99;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzUwOTU0MCwKICAicHJvZmlsZUlkIiA6ICI1MjhlYzVmMmEzZmM0MDA0YjYwY2IwOTA5Y2JiMjdjYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJQdWxpenppIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzViYzRjMmNiOTlmNjQ3MjE3YmFhN2MxOWQ3NGVlMWYwMjU3Y2ZkZmMxYmVmYWI0MzA0ZDM0NTVkNDY2ZTg0MSIKICAgIH0KICB9Cn0=";
    }

}
