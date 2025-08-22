package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VAMPIRE_WITCH_MASK extends SItem implements ItemStatistics, SkullItem {

    @Override
    public String getName() {
        return "Vampire Witch Mask";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VAMPIRE_WITCH_MASK"; 
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
        return Rarity.EPIC;
    }

    @Override
    public Gamestage getGamestage() {
        return Gamestage.EXPERT;
    }

    @Override
    public int getHealth() {
        return 132;
    }

    @Override
    public int getDefense() {
        return 222;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MzkyNzg2NiwKICAicHJvZmlsZUlkIiA6ICI3YjA5ZDg5NWQyYjc0NTU3YmM0YTkzNWYyNjU0NWNjNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJBaXJwbGFuZUdvQnJyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzZjZmNjYzEwOTUzZWViNzMzMDBiN2JmY2FmY2QzZmQ2NDFhZTczOTU1ODY2MmY2MjU2NjdhMmU5ZDMzY2RlNzQiCiAgICB9CiAgfQp9";
    }

}
