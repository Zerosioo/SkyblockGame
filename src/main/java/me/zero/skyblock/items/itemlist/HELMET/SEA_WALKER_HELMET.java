package me.zero.skyblock.items.itemlist.HELMET;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SEA_WALKER_HELMET extends SItem implements ItemStatistics, SkullItem, Sellable {

    @Override
    public String getName() {
        return "Sea Walker Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SEA_WALKER_HELMET"; 
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
    public int getPrice() {
        return 50;
    }

    @Override
    public int getHealth() {
        return 20;
    }

    @Override
    public int getDefense() {
        return 20;
    }

    @Override
    public String getTexture() {
        return "eyJ0aW1lc3RhbXAiOjE1MDc4MTY5NTgzMzQsInByb2ZpbGVJZCI6ImMxZWQ5N2Q0ZDE2NzQyYzI5OGI1ODFiZmRiODhhMjFmIiwicHJvZmlsZU5hbWUiOiJ5b2xvX21hdGlzIiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kODhiYThiYjUwYjc5ZTQ0MWU0N2I3ZTQ1Mjc2NGQ1ZmZmNjY5Mzc3OWQyZGFkZDlmN2Y1MmY5OGQ3ZWEwIn19fQ==";
    }

}
